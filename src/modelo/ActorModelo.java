package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ActorModelo extends Conectar {

	public void insert(Actor actor) {
		try {
			PreparedStatement pst = super.getConexion().prepareStatement("insert into actor (first_name, last_name) values (?,?)");
			
			pst.setString(1,actor.getFirst_name());
			pst.setString(2,actor.getLast_name());
			
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Actor> select() {
		ArrayList<Actor> actores = new ArrayList<Actor>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from actor");
			while (rs.next()) {
				actores.add(new Actor(rs.getInt(rs.getInt("actor_id")), rs.getString("first_name"), rs.getString("last_name")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actores;
	}
}
