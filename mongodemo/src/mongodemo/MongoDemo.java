package mongodemo;
import com.mongodb.client.FindIterable; 
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;  
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import java.util.Iterator; 

import org.bson.Document; 

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class MongoDemo { 
   
	public static void main( String args[] ) {  
	      
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 

	      // Creating Credentials 
	      MongoCredential credential;
	      credential = MongoCredential.createCredential("newUser", "Kingdom", 
	         "password".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	   // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("Kingdom"); 
	      
	      //Creating a collection 
	      database.createCollection("subjects"); 
	      System.out.println("Collection created successfully"); 
	      
	   // Retrieving a collection
	      MongoCollection<Document> collection = database.getCollection("sampleCollection"); 
	      System.out.println("Collection sampleCollection selected successfully");

	    //Insertion
//	      Document document = new Document("title", "MongoDB") 
//	      .append("id", 1)
//	      .append("name", "Wolfrich the great") 
//	      .append("title", "Duke") 
//	      .append("age", 70);  
//	      collection.insertOne(document); 
//	      System.out.println("Document inserted successfully");    
	      
	      
	   // Getting the iterable object
//	      FindIterable<Document> iterDoc = collection.find(); 
//	      int i = 1; 
//
//	      // Getting the iterator 
//	      Iterator it = iterDoc.iterator(); 
//
//	      while (it.hasNext()) {  
//	         System.out.println(it.next());  
//	         i++; 
//	      }     
	      
	      
	      //Updating
//	      collection.updateOne(Filters.eq("id", 1), Updates.set("title", "Lord"));       
//	      System.out.println("Document update successfully..."); 
	      
	      
	   // Dropping a Collection 
//	      collection.drop(); 
//	      System.out.println("Collection dropped successfully");

	    
   } 
}