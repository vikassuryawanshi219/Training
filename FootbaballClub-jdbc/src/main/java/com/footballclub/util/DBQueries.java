package com.footballclub.util;

public class DBQueries {
	public static final String INSERTQUERY=
			"INSERT INTO FOOTBALLCLUB (club_name, player_name, player_position , player_wages) value(?,?,?,?)";
	public static final String UPDATEQUERY=
			"UPDATE FOOTBALLCLUB SET player_wages=? Where player_Id=?";
	public static final String deleteQUERY=
			"DELETE FROM FOOTBALLCLUB WHERE player_Id=?";
	
	public static  final String SELECTQUERY="SELECT * FROM FOOTBALLCLUB";
	public static  final String SELECTBYCLUBNAME="SELECT * FROM FOOTBALLCLUB WHERE CLUB_NAME=?";
	public static  final String SELECTBYPLAYERNAME="SELECT * FROM FOOTBALLCLUB WHERE PLAYER_NAME=?";
	public static  final String SELECTBYPLAYERPOSITION="SELECT * FROM FOOTBALLCLUB WHERE RISK=? AND TERM<?";
	public static  final String SELECTBYPLAYERWAGES="SELECT * FROM FOOTBALLCLUB WHERE PLAYER_WAGES>?";
	public static  final String SELECTBYPLAYERNUMBER="SELECT * FROM FOOTBALLCLUB WHERE PLAYER_ID=?";
}
