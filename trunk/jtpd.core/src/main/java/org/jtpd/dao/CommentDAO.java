/**
 * 
 */
package org.jtpd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.jtpd.domain.model.Comment;
import org.springframework.stereotype.Repository;

/**
 * @author tdiler
 *
 */
@Repository
public class CommentDAO extends GenericDAO<Integer, Comment> implements ICommentDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4452776003742695313L;

    // TODO CommentService i�erisine ta��nmal�
    public void approveComments(List<Comment> comments) {
        for (Comment c : comments) {
            c.setApproved(true);
        }
    }

    public void deleteComments(List<Comment> comments) {
        for (Comment c : comments) {
            this.remove(c);
        }
    }
    
    public void saveComment(Comment comment) {
    	this.saveOrUpdate(comment);
    }

    @SuppressWarnings("unchecked")
	public List<Comment> getWaitingComments() {
        Criteria criteria = this.getSession().createCriteria(Comment.class);
        criteria.add(Restrictions.eq("approved", false));
        criteria.addOrder(Order.desc("date"));
        return (List<Comment>)criteria.list();
    }
    
    // TODO Max Result Count'a ne gerek var burada
    public List<Comment> getLastComments(int count) {
        Criteria criteria = this.getSession().createCriteria(Comment.class);
        criteria.add(Restrictions.eq("approved", true));
        criteria.addOrder(Order.desc("date"));
        return (List<Comment>)criteria.list();
    }
}
