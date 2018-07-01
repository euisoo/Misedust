package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import model.dto.IndoorDTO;
import model.dto.PredictedDataDTO;
import util.DBUtil;

public class PredictedDataDAO {
	static ResourceBundle sql = DBUtil.getResourceBundle();

	public static PredictedDataDTO getPredictedData(String refTime) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		PredictedDataDTO predictedData = new PredictedDataDTO(refTime);

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("SELECT location, miseAfter1,  miseAfter2,  miseAfter3, chomiseAfter1, chomiseAfter2, chomiseAfter3 FROM predictedData WHERE refTime=?");
			pstmt.setString(1, refTime);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				String location = rset.getString(1);
				predictedData.getMiseAfter1().put(location, rset.getInt(2));
				predictedData.getMiseAfter2().put(location, rset.getInt(3));
				predictedData.getMiseAfter3().put(location, rset.getInt(4));
				predictedData.getChomiseAfter1().put(location, rset.getInt(5));
				predictedData.getChomiseAfter2().put(location, rset.getInt(6));
				predictedData.getChomiseAfter3().put(location, rset.getInt(7));
				
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return predictedData;
	}

}