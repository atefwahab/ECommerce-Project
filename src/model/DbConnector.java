package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import dao.Product;
import java.util.Vector;
import util.DesEncrypter;

public class DbConnector {

    String url="jdbc:mysql://localhost:3306/";
    String Driver="com.mysql.jdbc.Driver";
    String dbname="ecommerce";
    String username="root";
    String password="";
    Connection connection;
    Statement statement;
    ResultSet resultSet;
	public DbConnector() {
		 try{
	            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	            connection = (Connection) DriverManager.getConnection(url+dbname,username,password);
	        }catch(Exception e){e.printStackTrace();}    
	}
	
	/* 
	  @author: donia
	  function get name of categories from DB
	  return ArrayList
	  */
	public ArrayList<String> getCategories(){
		
		ArrayList<String> categories=new ArrayList<>();
		
		String sql = "select * from categories";
		  try {
			statement=(Statement) connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				categories.add(resultSet.getString(2));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return categories;
		
	}
        
        
        /* 
	  @author: donia
	  function get id of categories from DB
	  return ArrayList
	  */
	public ArrayList<String> getIdOfCategories(){
		
		ArrayList<String> ids=new ArrayList<>();
		
		String sql = "select * from categories";
		  try {
			statement=(Statement) connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				ids.add(resultSet.getString(1));
                                
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ids;
		
	}
        
	
	
	
	
	/* 
	  author: donia
	  function insert data of user in DB
	  return nothing
	  */


	public void insertInDB(String name, String date, String pass, String job, String e_mail, String credit_Limit,
			String address, String interest) {
		// TODO Auto-generated method stub
                 DesEncrypter encrypter = new DesEncrypter();
                 String passEncrypt=encrypter.encrypt(pass);
                 
                 
		try {
			statement=(Statement) connection.createStatement();
			String sql = "INSERT INTO users(name,birthday,Password,job,email,credit_limit,address,interests) VALUES ('"+name+"','"+date+"','"+passEncrypt+"','"+job+"','"+e_mail+"','"+credit_Limit+"','"+address+"','"+interest+"')";	
			
                        statement.executeUpdate(sql);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}


	/* 
	  author: donia
	  function check e_mail and password from DB to login
	  return boolean
	  */
	public boolean chickLogin(String pass, String e_mail) {
		// TODO Auto-generated method stub
		boolean flag=false; 
                
                DesEncrypter encrypter = new DesEncrypter();
                String password=encrypter.encrypt(pass);
		String sql = "select * from users where email = '"+e_mail+"'and Password='"+password+"'";
		  try {
			statement=(Statement) connection.createStatement();
			resultSet = statement.executeQuery(sql);
			 flag= resultSet.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
		
	}
        
        
        /**
         * this method used for get Vector of products
         * @param categoryId an int represent the id of the category_id in db
         * @author Atef.
         * @return vector of products from that category
         */
        public Vector<Product> getProducts(int categoryId){
            
            Vector<Product> products = new Vector<>();
            String query="SELECT * FROM `product` WHERE `category_id`="+categoryId;
            System.out.println(query);
            try {
                statement=(Statement)connection.createStatement();
                 resultSet=statement.executeQuery(query);
                
                // add products to vector
                while(resultSet.next()){
                    Product product = new Product();
                    product.setId(resultSet.getInt("product_id"));
                    product.setName(resultSet.getString("product_name"));
                    product.setPrice(resultSet.getDouble("product_price"));
                    product.setQuantity(resultSet.getInt("quantity"));
                    product.setCategoryId(resultSet.getInt("category_id"));
                    product.setDescription(resultSet.getString("product_description"));
                    product.setImagePath(resultSet.getString("image_path"));
                    
                    products.addElement(product);
                   
               //end of while             
                }
                
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            return products;
        }
	/*
        author:donia
        check if exist user the same email register or not
        */
	
	public boolean checkDublicateUserInSignUp(String e_mail){
            boolean flag=true;
            {
                try {
                String query="SELECT * FROM `users` WHERE `email`='"+e_mail+"'";
                 System.out.println(query);
            
                statement=(Statement)connection.createStatement();
                 resultSet=statement.executeQuery(query);
                
                    
                        // add products to vector
                        flag= resultSet.next();
                        
                        
                } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    }
            return flag;
        }
	/*
        author:donia
        function take email the return name of this email
        */
        
        public String getNameOfEmail(String email){
            String name="";
            try {
                String query="SELECT name FROM `users` WHERE `email`='"+email+"'";
                 
            
                statement=(Statement)connection.createStatement();
                 resultSet=statement.executeQuery(query);
                
                    
                        // add products to vector
                         if(resultSet.next())
                             name=resultSet.getString("name");
                        System.out.println("inside getname "+name);
                        
                } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
            return name;
        }
        
        
        /*
        author:donia
        get all data of user using email
        */
        
       public Vector<String> getAllData(String email){
            Vector <String> data=new Vector<>();
            try {
                String query="SELECT * FROM `users` WHERE `email`='"+email+"'";
                 
            
                 statement=(Statement)connection.createStatement();
                 resultSet=statement.executeQuery(query);
                
                    
                        // add products to vector
                         if(resultSet.next())
                             data.add(resultSet.getString(2));
                             data.add(resultSet.getString(3));
                             data.add(resultSet.getString(4));
                             data.add(resultSet.getString(5));
                             data.add(resultSet.getString(6));
                             data.add(resultSet.getString(7));
                             data.add(resultSet.getString(8));
                             data.add(resultSet.getString(9));
                        
                        
                } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
            return data;
        }

       /*
       author:donia
       update profile data 
       */
    

    public void UpdateProfile(String email, String birth, String pass, String job, String name, String credit, String address, String interest) {
            
        try {
                           DesEncrypter encrypter = new DesEncrypter();
                           String passEncrypt=encrypter.encrypt(pass);
			statement=(Statement) connection.createStatement();
                       
			String sql = "update users set name='"+name+"', birthday='"+birth+"', Password='"+passEncrypt+"', job='"+job+"',credit_limit="+credit+",address='"+address+"',interests='"+interest+"' where email='"+email+"'"; 	
			
                        statement.executeUpdate(sql);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
        
    }
}
