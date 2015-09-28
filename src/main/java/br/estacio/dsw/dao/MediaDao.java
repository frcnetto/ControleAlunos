package br.estacio.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.estacio.dsw.model.Media;
import br.estacio.dsw.persistence.jdbc.ConnectionFactory;

public class MediaDao {
	private Connection conexao = ConnectionFactory.getConnection();

	public MediaDao(){
		
	}
	
	public boolean cadMedia(Media media){
		String sql = "INSERT INTO media(expressao) values(?)";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, media.getExpressao());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updMedia(Media media){
		String sql = "UPDATE media SET expressao = ? WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, media.getExpressao());
			prepared.setInt(2, media.getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Media> cstMediaId(Media media){
		String sql = "SELECT * FROM media WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setInt(1, media.getId());
			ResultSet result = prepared.executeQuery();
			if(result != null){
				ArrayList<Media> medias = new ArrayList<Media>();
				while(result.next()){
					Media mda = new Media();
					mda.setId(result.getInt(1));
					mda.setExpressao(result.getString(2));
					medias.add(mda);
				}
				return medias;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Media> lstMedia(){
		String sql = "SELECT * FROM media";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			ResultSet result = prepared.executeQuery();
			if(result != null){
				ArrayList<Media> medias = new ArrayList<Media>();
				while(result.next()){
					Media mda = new Media();
					mda.setId(result.getInt(1));
					mda.setExpressao(result.getString(2));
					medias.add(mda);
				}
				return medias;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean delMedia(Media media){
		String sql = "DELETE FROM media WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setInt(1, media.getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
