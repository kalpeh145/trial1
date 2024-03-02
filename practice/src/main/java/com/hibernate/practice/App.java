package com.hibernate.practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


/*
 * 
 * ctr + shift + T
 */


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		/*
		 * Session gives method to save object in to db
		 */
		// create configuration
		SessionFactory sessionFactory=Util.getSessionFactory();
		Session session=sessionFactory.openSession();
		//Transaction transaction=session.beginTransaction();
		//Songs songs=session.get(Songs.class, 1);
		//songs.setSongName("pushpa");
		//System.out.println("Debug" +songs);
		Query query=session.createQuery("from Songs");
		List<Songs> songs=query.list();
		for(Songs songs1:songs) {
			System.out.println("id is " +songs1.getId());
			System.out.println("artist is "+ songs1.getArtist());
			System.out.println("song name "+ songs1.getSongName());
			}
		session.close();
	
		//transaction.commit();
		
		//System.out.println("Song updated...check db");
	}
}
