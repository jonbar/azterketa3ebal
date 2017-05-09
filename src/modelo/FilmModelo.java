package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FilmModelo extends Conectar {

	public ArrayList<Film> select() {
		ArrayList<Film> peliculas = new ArrayList<Film>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from film");
			while (rs.next()) {
				peliculas.add(new Film(rs.getInt("film_id"), rs.getString("title"), rs.getString("description"),
						rs.getInt("release_year"), rs.getInt("language_id")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculas;
	}

	public Film select(String idFilm) {
		Film pelicula = new Film();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from film where film_id='" + idFilm + "'");
			while (rs.next()) {
				pelicula.setFilm_id(rs.getInt("film_id"));
				pelicula.setTitle(rs.getString("title"));
				pelicula.setDescription(rs.getString("description"));
				pelicula.setRelease_year(rs.getInt("release_year"));
				pelicula.setLanguage_id(rs.getInt("language_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pelicula;
	}

	public ArrayList<Actor> select(int film_id) {
		ArrayList<Actor> actores = new ArrayList<Actor>();
		try {
			PreparedStatement ps;
			ps = this.conexion.prepareStatement("SELECT actor.* FROM film_actor join actor on film_actor.actor_id = actor.actor_id where film_id = ?");
			ps.setInt(1, film_id);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Actor actor = new Actor();
				actor.setActor_id(rs.getInt("actor_id"));
				actor.setFirst_name(rs.getString("first_name"));
				actor.setLast_name(rs.getString("last_name"));
				
				actores.add(actor);
			}
			return actores;
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return actores;
	}

}
