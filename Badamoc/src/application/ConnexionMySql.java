package application;

import java.sql.*;

import controllers.articles;
import controllers.clients;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ConnexionMySql {
	
	public Connection cn = null;
	
	public static Connection connexionDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cube", "root", "");
			System.out.println("Connexion réussi");
			return cn;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Connexion echouée");
			e.printStackTrace();
			return null;
		}
	}
	
	public static ObservableList<articles> getDataarticle(){
		
		Connection cn = connexionDB();
		ObservableList<articles> list = FXCollections.observableArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from article");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				list.add(new articles(Integer.parseInt(rs.getString("N_articles")), null, null, null, null, 0, 0, 0));
			}
		} catch (Exception e){
			
		}
		return list;
	}
	
	public static ObservableList<clients> getDataclient(){
		
		Connection cn = connexionDB();
		ObservableList<clients> listClient = FXCollections.observableArrayList();
		try {
			PreparedStatement psClient = cn.prepareStatement("select * from client");
			ResultSet rsClient = psClient.executeQuery();
			
			while(rsClient.next()) {
				
				listClient.add(new clients(Integer.parseInt(rsClient.getString("N_clients")), rsClient.getString("Nom"), rsClient.getString("Prenom"), rsClient.getString("Mail"), rsClient.getString("Mots_de_passe"), rsClient.getString("Adresse")));
			}
		} catch (Exception e){
			
		}
		return listClient;
	}
}
