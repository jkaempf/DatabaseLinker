import java.io.*;
import java.sql.*;
import org.postgis.*;
import org.postgresql.util.PGobject;

import java.lang.*;
import java.util.*;

public class CitySimDatabaseLinkerXML
{
	@SuppressWarnings("unchecked")
		public static void main(String[] argv)
		{
			System.out.println("Checking if Driver is registered with DriverManager.");

			try
			{
				Class.forName("org.postgresql.Driver");
			}
			catch (ClassNotFoundException cnfe)
			{
				System.out.println("Couldn't find the driver!");
				System.out.println("Let's print a stack trace, and exit.");
				cnfe.printStackTrace();
				System.exit(1);
			}

			System.out.println("Registered the driver ok, so let's make a connection.");

			Connection c = null;

			try
			{
				// The second and third arguments are the username and password,
				// respectively. They should be whatever is necessary to connect
				// to the database.
				c = DriverManager.getConnection("jdbc:postgresql://kaemco.synology.me/jonction","adrien", "favre");
			}
			catch (SQLException se)
			{
				System.out.println("Couldn't connect: print out a stack trace and exit.");
				se.printStackTrace();
				System.exit(1);
			}

			if (c != null) {
				System.out.println("Hooray! We connected to the database!");
				try {
					// cast the connection as an postgresql connection and add the data type geometry
					((org.postgresql.PGConnection)c).addDataType("geometry", (Class<? extends PGobject>) Class.forName("org.postgis.PGgeometry"));
					// creates a file writer for the XML file
					
					//FileWriter fw = new FileWriter("essai_small.xml");
					FileWriter fw = new FileWriter("currentNoSolar.xml");
					
					// writes the standard header of the XML file for CitySim
					fw.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n");
					fw.write("<CitySim>\n");
					fw.write("<Simulation beginMonth=\"1\" endMonth=\"12\" beginDay=\"1\" endDay=\"31\"/>\n");
					fw.write("<Climate location=\"Geneva.cli\"/>\n");
					// open the district tag
					fw.write("<District>\n");

					fw.write("<FarFieldObstructions>\n<Point phi=\"180\"  theta=\"3\"/>\n<Point phi=\"181\"  theta=\"3\"/>\n<Point phi=\"182\"  theta=\"3\"/>\n<Point phi=\"183\"  theta=\"3\"/>\n<Point phi=\"184\"  theta=\"2\"/>\n<Point phi=\"185\"  theta=\"2\"/>\n<Point phi=\"186\"  theta=\"2\"/>\n<Point phi=\"187\"  theta=\"2\"/>\n<Point phi=\"188\"  theta=\"2\"/>\n<Point phi=\"189\"  theta=\"2\"/>\n<Point phi=\"190\"  theta=\"2\"/>\n<Point phi=\"191\"  theta=\"2\"/>\n<Point phi=\"192\"  theta=\"2\"/>\n<Point phi=\"193\"  theta=\"1\"/>\n<Point phi=\"194\"  theta=\"1\"/>\n<Point phi=\"195\"  theta=\"1\"/>\n<Point phi=\"196\"  theta=\"1\"/>\n<Point phi=\"197\"  theta=\"1\"/>\n<Point phi=\"198\"  theta=\"1\"/>\n<Point phi=\"199\"  theta=\"1\"/>\n<Point phi=\"200\"  theta=\"1\"/>\n<Point phi=\"201\"  theta=\"1\"/>\n<Point phi=\"202\"  theta=\"1\"/>\n<Point phi=\"203\"  theta=\"1\"/>\n<Point phi=\"204\"  theta=\"1\"/>\n<Point phi=\"205\"  theta=\"1\"/>\n<Point phi=\"206\"  theta=\"1\"/>\n<Point phi=\"207\"  theta=\"1\"/>\n<Point phi=\"208\"  theta=\"1\"/>\n<Point phi=\"209\"  theta=\"1\"/>\n<Point phi=\"210\"  theta=\"1\"/>\n<Point phi=\"211\"  theta=\"1\"/>\n<Point phi=\"212\"  theta=\"1\"/>\n<Point phi=\"213\"  theta=\"1\"/>\n<Point phi=\"214\"  theta=\"0\"/>\n<Point phi=\"215\"  theta=\"0\"/>\n<Point phi=\"216\"  theta=\"0\"/>\n<Point phi=\"217\"  theta=\"0\"/>\n<Point phi=\"218\"  theta=\"0\"/>\n<Point phi=\"219\"  theta=\"0\"/>\n<Point phi=\"220\"  theta=\"0\"/>\n<Point phi=\"221\"  theta=\"0\"/>\n<Point phi=\"222\"  theta=\"0\"/>\n<Point phi=\"223\"  theta=\"0\"/>\n<Point phi=\"224\"  theta=\"0\"/>\n<Point phi=\"225\"  theta=\"0\"/>\n<Point phi=\"226\"  theta=\"0\"/>\n<Point phi=\"227\"  theta=\"0\"/>\n<Point phi=\"228\"  theta=\"0\"/>\n<Point phi=\"229\"  theta=\"0\"/>\n<Point phi=\"230\"  theta=\"0\"/>\n<Point phi=\"231\"  theta=\"0\"/>\n<Point phi=\"232\"  theta=\"0\"/>\n<Point phi=\"233\"  theta=\"0\"/>\n<Point phi=\"234\"  theta=\"0\"/>\n<Point phi=\"235\"  theta=\"0\"/>\n<Point phi=\"236\"  theta=\"0\"/>\n<Point phi=\"237\"  theta=\"0\"/>\n<Point phi=\"238\"  theta=\"0\"/>\n<Point phi=\"239\"  theta=\"0\"/>\n<Point phi=\"240\"  theta=\"0\"/>\n<Point phi=\"241\"  theta=\"0\"/>\n<Point phi=\"242\"  theta=\"0\"/>\n<Point phi=\"243\"  theta=\"0\"/>\n<Point phi=\"244\"  theta=\"0\"/>\n<Point phi=\"245\"  theta=\"0\"/>\n<Point phi=\"246\"  theta=\"0\"/>\n<Point phi=\"247\"  theta=\"1\"/>\n<Point phi=\"248\"  theta=\"1\"/>\n<Point phi=\"249\"  theta=\"1\"/>\n<Point phi=\"250\"  theta=\"1\"/>\n<Point phi=\"251\"  theta=\"1\"/>\n<Point phi=\"252\"  theta=\"1\"/>\n<Point phi=\"253\"  theta=\"1\"/>\n<Point phi=\"254\"  theta=\"1\"/>\n<Point phi=\"255\"  theta=\"1\"/>\n<Point phi=\"256\"  theta=\"1\"/>\n<Point phi=\"257\"  theta=\"1\"/>\n<Point phi=\"258\"  theta=\"1\"/>\n<Point phi=\"259\"  theta=\"1\"/>\n<Point phi=\"260\"  theta=\"1\"/>\n<Point phi=\"261\"  theta=\"1\"/>\n<Point phi=\"262\"  theta=\"2\"/>\n<Point phi=\"263\"  theta=\"2\"/>\n<Point phi=\"264\"  theta=\"2\"/>\n<Point phi=\"265\"  theta=\"2\"/>\n<Point phi=\"266\"  theta=\"2\"/>\n<Point phi=\"267\"  theta=\"2\"/>\n<Point phi=\"268\"  theta=\"2\"/>\n<Point phi=\"269\"  theta=\"2\"/>\n<Point phi=\"270\"  theta=\"2\"/>\n<Point phi=\"271\"  theta=\"2\"/>\n<Point phi=\"272\"  theta=\"2\"/>\n<Point phi=\"273\"  theta=\"3\"/>\n<Point phi=\"274\"  theta=\"3\"/>\n<Point phi=\"275\"  theta=\"3\"/>\n<Point phi=\"276\"  theta=\"3\"/>\n<Point phi=\"277\"  theta=\"3\"/>\n<Point phi=\"278\"  theta=\"3\"/>\n<Point phi=\"279\"  theta=\"3\"/>\n<Point phi=\"280\"  theta=\"3\"/>\n<Point phi=\"281\"  theta=\"3\"/>\n<Point phi=\"282\"  theta=\"3\"/>\n<Point phi=\"283\"  theta=\"3\"/>\n<Point phi=\"284\"  theta=\"3\"/>\n<Point phi=\"285\"  theta=\"3\"/>\n<Point phi=\"286\"  theta=\"3\"/>\n<Point phi=\"287\"  theta=\"3\"/>\n<Point phi=\"288\"  theta=\"3\"/>\n<Point phi=\"289\"  theta=\"3\"/>\n<Point phi=\"290\"  theta=\"3\"/>\n<Point phi=\"291\"  theta=\"2\"/>\n<Point phi=\"292\"  theta=\"2\"/>\n<Point phi=\"293\"  theta=\"2\"/>\n<Point phi=\"294\"  theta=\"1\"/>\n<Point phi=\"295\"  theta=\"1\"/>\n<Point phi=\"296\"  theta=\"1\"/>\n<Point phi=\"297\"  theta=\"1\"/>\n<Point phi=\"298\"  theta=\"1\"/>\n<Point phi=\"299\"  theta=\"1\"/>\n<Point phi=\"300\"  theta=\"1\"/>\n<Point phi=\"301\"  theta=\"2\"/>\n<Point phi=\"302\"  theta=\"2\"/>\n<Point phi=\"303\"  theta=\"2\"/>\n<Point phi=\"304\"  theta=\"2\"/>\n<Point phi=\"305\"  theta=\"2\"/>\n<Point phi=\"306\"  theta=\"2\"/>\n<Point phi=\"307\"  theta=\"2\"/>\n<Point phi=\"308\"  theta=\"2\"/>\n<Point phi=\"309\"  theta=\"2\"/>\n<Point phi=\"310\"  theta=\"2\"/>\n<Point phi=\"311\"  theta=\"2\"/>\n<Point phi=\"312\"  theta=\"2\"/>\n<Point phi=\"313\"  theta=\"2\"/>\n<Point phi=\"314\"  theta=\"2\"/>\n<Point phi=\"315\"  theta=\"2\"/>\n<Point phi=\"316\"  theta=\"2\"/>\n<Point phi=\"317\"  theta=\"2\"/>\n<Point phi=\"318\"  theta=\"2\"/>\n<Point phi=\"319\"  theta=\"2\"/>\n<Point phi=\"320\"  theta=\"2\"/>\n<Point phi=\"321\"  theta=\"2\"/>\n<Point phi=\"322\"  theta=\"2\"/>\n<Point phi=\"323\"  theta=\"2\"/>\n<Point phi=\"324\"  theta=\"2\"/>\n<Point phi=\"325\"  theta=\"2\"/>\n<Point phi=\"326\"  theta=\"2\"/>\n<Point phi=\"327\"  theta=\"2\"/>\n<Point phi=\"328\"  theta=\"3\"/>\n<Point phi=\"329\"  theta=\"3\"/>\n<Point phi=\"330\"  theta=\"3\"/>\n<Point phi=\"331\"  theta=\"3\"/>\n<Point phi=\"332\"  theta=\"3\"/>\n<Point phi=\"333\"  theta=\"4\"/>\n<Point phi=\"334\"  theta=\"4\"/>\n<Point phi=\"335\"  theta=\"4\"/>\n<Point phi=\"336\"  theta=\"4\"/>\n<Point phi=\"337\"  theta=\"4\"/>\n<Point phi=\"338\"  theta=\"4\"/>\n<Point phi=\"339\"  theta=\"4\"/>\n<Point phi=\"340\"  theta=\"4\"/>\n<Point phi=\"341\"  theta=\"4\"/>\n<Point phi=\"342\"  theta=\"4\"/>\n<Point phi=\"343\"  theta=\"4\"/>\n<Point phi=\"344\"  theta=\"4\"/>\n<Point phi=\"345\"  theta=\"3\"/>\n<Point phi=\"346\"  theta=\"3\"/>\n<Point phi=\"347\"  theta=\"3\"/>\n<Point phi=\"348\"  theta=\"3\"/>\n<Point phi=\"349\"  theta=\"3\"/>\n<Point phi=\"350\"  theta=\"3\"/>\n<Point phi=\"351\"  theta=\"3\"/>\n<Point phi=\"352\"  theta=\"3\"/>\n<Point phi=\"353\"  theta=\"3\"/>\n<Point phi=\"354\"  theta=\"3\"/>\n<Point phi=\"355\"  theta=\"3\"/>\n<Point phi=\"356\"  theta=\"3\"/>\n<Point phi=\"357\"  theta=\"3\"/>\n<Point phi=\"358\"  theta=\"3\"/>\n<Point phi=\"359\"  theta=\"3\"/>\n<Point phi=\"0\"  theta=\"3\"/>\n<Point phi=\"1\"  theta=\"3\"/>\n<Point phi=\"2\"  theta=\"2\"/>\n<Point phi=\"3\"  theta=\"2\"/>\n<Point phi=\"4\"  theta=\"2\"/>\n<Point phi=\"5\"  theta=\"2\"/>\n<Point phi=\"6\"  theta=\"2\"/>\n<Point phi=\"7\"  theta=\"1\"/>\n<Point phi=\"8\"  theta=\"1\"/>\n<Point phi=\"9\"  theta=\"1\"/>\n<Point phi=\"10\"  theta=\"1\"/>\n<Point phi=\"11\"  theta=\"1\"/>\n<Point phi=\"12\"  theta=\"2\"/>\n<Point phi=\"13\"  theta=\"2\"/>\n<Point phi=\"14\"  theta=\"2\"/>\n<Point phi=\"15\"  theta=\"2\"/>\n<Point phi=\"16\"  theta=\"2\"/>\n<Point phi=\"17\"  theta=\"2\"/>\n<Point phi=\"18\"  theta=\"2\"/>\n<Point phi=\"19\"  theta=\"2\"/>\n<Point phi=\"20\"  theta=\"2\"/>\n<Point phi=\"21\"  theta=\"1\"/>\n<Point phi=\"22\"  theta=\"1\"/>\n<Point phi=\"23\"  theta=\"1\"/>\n<Point phi=\"24\"  theta=\"1\"/>\n<Point phi=\"25\"  theta=\"1\"/>\n<Point phi=\"26\"  theta=\"1\"/>\n<Point phi=\"27\"  theta=\"1\"/>\n<Point phi=\"28\"  theta=\"1\"/>\n<Point phi=\"29\"  theta=\"1\"/>\n<Point phi=\"30\"  theta=\"1\"/>\n<Point phi=\"31\"  theta=\"1\"/>\n<Point phi=\"32\"  theta=\"1\"/>\n<Point phi=\"33\"  theta=\"1\"/>\n<Point phi=\"34\"  theta=\"1\"/>\n<Point phi=\"35\"  theta=\"2\"/>\n<Point phi=\"36\"  theta=\"2\"/>\n<Point phi=\"37\"  theta=\"2\"/>\n<Point phi=\"38\"  theta=\"1\"/>\n<Point phi=\"39\"  theta=\"1\"/>\n<Point phi=\"40\"  theta=\"1\"/>\n<Point phi=\"41\"  theta=\"1\"/>\n<Point phi=\"42\"  theta=\"1\"/>\n<Point phi=\"43\"  theta=\"1\"/>\n<Point phi=\"44\"  theta=\"1\"/>\n<Point phi=\"45\"  theta=\"1\"/>\n<Point phi=\"46\"  theta=\"1\"/>\n<Point phi=\"47\"  theta=\"1\"/>\n<Point phi=\"48\"  theta=\"1\"/>\n<Point phi=\"49\"  theta=\"1\"/>\n<Point phi=\"50\"  theta=\"1\"/>\n<Point phi=\"51\"  theta=\"0\"/>\n<Point phi=\"52\"  theta=\"1\"/>\n<Point phi=\"53\"  theta=\"1\"/>\n<Point phi=\"54\"  theta=\"1\"/>\n<Point phi=\"55\"  theta=\"2\"/>\n<Point phi=\"56\"  theta=\"2\"/>\n<Point phi=\"57\"  theta=\"2\"/>\n<Point phi=\"58\"  theta=\"3\"/>\n<Point phi=\"59\"  theta=\"3\"/>\n<Point phi=\"60\"  theta=\"3\"/>\n<Point phi=\"61\"  theta=\"3\"/>\n<Point phi=\"62\"  theta=\"3\"/>\n<Point phi=\"63\"  theta=\"3\"/>\n<Point phi=\"64\"  theta=\"3\"/>\n<Point phi=\"65\"  theta=\"3\"/>\n<Point phi=\"66\"  theta=\"3\"/>\n<Point phi=\"67\"  theta=\"3\"/>\n<Point phi=\"68\"  theta=\"3\"/>\n<Point phi=\"69\"  theta=\"3\"/>\n<Point phi=\"70\"  theta=\"3\"/>\n<Point phi=\"71\"  theta=\"3\"/>\n<Point phi=\"72\"  theta=\"3\"/>\n<Point phi=\"73\"  theta=\"3\"/>\n<Point phi=\"74\"  theta=\"3\"/>\n<Point phi=\"75\"  theta=\"3\"/>\n<Point phi=\"76\"  theta=\"3\"/>\n<Point phi=\"77\"  theta=\"3\"/>\n<Point phi=\"78\"  theta=\"3\"/>\n<Point phi=\"79\"  theta=\"3\"/>\n<Point phi=\"80\"  theta=\"3\"/>\n<Point phi=\"81\"  theta=\"3\"/>\n<Point phi=\"82\"  theta=\"4\"/>\n<Point phi=\"83\"  theta=\"4\"/>\n<Point phi=\"84\"  theta=\"4\"/>\n<Point phi=\"85\"  theta=\"4\"/>\n<Point phi=\"86\"  theta=\"4\"/>\n<Point phi=\"87\"  theta=\"4\"/>\n<Point phi=\"88\"  theta=\"4\"/>\n<Point phi=\"89\"  theta=\"4\"/>\n<Point phi=\"90\"  theta=\"4\"/>\n<Point phi=\"91\"  theta=\"5\"/>\n<Point phi=\"92\"  theta=\"5\"/>\n<Point phi=\"93\"  theta=\"5\"/>\n<Point phi=\"94\"  theta=\"5\"/>\n<Point phi=\"95\"  theta=\"5\"/>\n<Point phi=\"96\"  theta=\"5\"/>\n<Point phi=\"97\"  theta=\"5\"/>\n<Point phi=\"98\"  theta=\"5\"/>\n<Point phi=\"99\"  theta=\"5\"/>\n<Point phi=\"100\"  theta=\"5\"/>\n<Point phi=\"101\"  theta=\"5\"/>\n<Point phi=\"102\"  theta=\"5\"/>\n<Point phi=\"103\"  theta=\"5\"/>\n<Point phi=\"104\"  theta=\"5\"/>\n<Point phi=\"105\"  theta=\"5\"/>\n<Point phi=\"106\"  theta=\"5\"/>\n<Point phi=\"107\"  theta=\"5\"/>\n<Point phi=\"108\"  theta=\"5\"/>\n<Point phi=\"109\"  theta=\"5\"/>\n<Point phi=\"110\"  theta=\"5\"/>\n<Point phi=\"111\"  theta=\"5\"/>\n<Point phi=\"112\"  theta=\"5\"/>\n<Point phi=\"113\"  theta=\"5\"/>\n<Point phi=\"114\"  theta=\"5\"/>\n<Point phi=\"115\"  theta=\"5\"/>\n<Point phi=\"116\"  theta=\"5\"/>\n<Point phi=\"117\"  theta=\"5\"/>\n<Point phi=\"118\"  theta=\"5\"/>\n<Point phi=\"119\"  theta=\"5\"/>\n<Point phi=\"120\"  theta=\"5\"/>\n<Point phi=\"121\"  theta=\"5\"/>\n<Point phi=\"122\"  theta=\"5\"/>\n<Point phi=\"123\"  theta=\"5\"/>\n<Point phi=\"124\"  theta=\"5\"/>\n<Point phi=\"125\"  theta=\"5\"/>\n<Point phi=\"126\"  theta=\"5\"/>\n<Point phi=\"127\"  theta=\"5\"/>\n<Point phi=\"128\"  theta=\"5\"/>\n<Point phi=\"129\"  theta=\"5\"/>\n<Point phi=\"130\"  theta=\"5\"/>\n<Point phi=\"131\"  theta=\"5\"/>\n<Point phi=\"132\"  theta=\"5\"/>\n<Point phi=\"133\"  theta=\"5\"/>\n<Point phi=\"134\"  theta=\"5\"/>\n<Point phi=\"135\"  theta=\"5\"/>\n<Point phi=\"136\"  theta=\"5\"/>\n<Point phi=\"137\"  theta=\"5\"/>\n<Point phi=\"138\"  theta=\"5\"/>\n<Point phi=\"139\"  theta=\"5\"/>\n<Point phi=\"140\"  theta=\"5\"/>\n<Point phi=\"141\"  theta=\"5\"/>\n<Point phi=\"142\"  theta=\"4\"/>\n<Point phi=\"143\"  theta=\"4\"/>\n<Point phi=\"144\"  theta=\"4\"/>\n<Point phi=\"145\"  theta=\"4\"/>\n<Point phi=\"146\"  theta=\"4\"/>\n<Point phi=\"147\"  theta=\"4\"/>\n<Point phi=\"148\"  theta=\"4\"/>\n<Point phi=\"149\"  theta=\"4\"/>\n<Point phi=\"150\"  theta=\"3\"/>\n<Point phi=\"151\"  theta=\"4\"/>\n<Point phi=\"152\"  theta=\"4\"/>\n<Point phi=\"153\"  theta=\"4\"/>\n<Point phi=\"154\"  theta=\"4\"/>\n<Point phi=\"155\"  theta=\"4\"/>\n<Point phi=\"156\"  theta=\"4\"/>\n<Point phi=\"157\"  theta=\"4\"/>\n<Point phi=\"158\"  theta=\"4\"/>\n<Point phi=\"159\"  theta=\"4\"/>\n<Point phi=\"160\"  theta=\"4\"/>\n<Point phi=\"161\"  theta=\"4\"/>\n<Point phi=\"162\"  theta=\"4\"/>\n<Point phi=\"163\"  theta=\"4\"/>\n<Point phi=\"164\"  theta=\"4\"/>\n<Point phi=\"165\"  theta=\"4\"/>\n<Point phi=\"166\"  theta=\"4\"/>\n<Point phi=\"167\"  theta=\"4\"/>\n<Point phi=\"168\"  theta=\"4\"/>\n<Point phi=\"169\"  theta=\"3\"/>\n<Point phi=\"170\"  theta=\"3\"/>\n<Point phi=\"171\"  theta=\"3\"/>\n<Point phi=\"172\"  theta=\"3\"/>\n<Point phi=\"173\"  theta=\"3\"/>\n<Point phi=\"174\"  theta=\"3\"/>\n<Point phi=\"175\"  theta=\"4\"/>\n<Point phi=\"176\"  theta=\"3\"/>\n<Point phi=\"177\"  theta=\"3\"/>\n<Point phi=\"178\"  theta=\"3\"/>\n<Point phi=\"179\"  theta=\"3\"/>\n<Point phi=\"180\"  theta=\"3\"/>\n</FarFieldObstructions>\n");

					// gets the information for the Composites in the database
					String myQuery = "SELECT composite_id,composite_name FROM data.composite"; // this is to be defined with the group of buildings
					Statement st = c.createStatement();
					ResultSet rs = st.executeQuery(myQuery);
					while (rs.next()) {
						String myQuery2 = "SELECT material_name, thickness, conductivity, cp, density FROM data.layer, data.material WHERE data.layer.composite_id_fk = " + rs.getString("composite_id") + " AND data.material.material_id = data.layer.material_id_fk ORDER BY layer_number ASC";
						Statement st2 = c.createStatement();
						ResultSet rs2 = st2.executeQuery(myQuery2);
						if(rs2.next()){
							fw.write("<Composite id=\"" + rs.getInt("composite_id") + "\" name=\"" + rs.getString("composite_name") + "\">\n");
							do{
								fw.write("<Layer Name=\"" + rs2.getString("material_name") + "\" Thickness=\"" + rs2.getDouble("thickness") + "\" Conductivity=\"" + rs2.getDouble("conductivity") + "\" Cp=\"" + rs2.getDouble("cp") + "\" Density=\"" + rs2.getDouble("density") + "\"/>\n");
							}while (rs2.next());
							fw.write("</Composite>\n");
							fw.flush();
						}
					}

					//Occupancy profiles (obtained from the SIA norm as a function of the building occupancy type)
					fw.write("<OccupancyDayProfile id=\"0\" p1=\"0.0\" p2=\"0.0\" p3=\"0.0\" p4=\"0.0\" p5=\"0.0\" p6=\"0.0\" p7=\"0.0\" p8=\"0.0\" p9=\"0.0\" p10=\"0.0\" p11=\"0.0\" p12=\"0.0\" p13=\"0.0\" p14=\"0.0\" p15=\"0.0\" p16=\"0.0\" p17=\"0.0\" p18=\"0.0\" p19=\"0.0\" p20=\"0.0\" p21=\"0.0\" p22=\"0.0\" p23=\"0.0\" p24=\"0.0\"/>\n");
					fw.write("<OccupancyDayProfile id=\"1\" p1=\"1.0\" p2=\"1.0\" p3=\"1.0\" p4=\"1.0\" p5=\"1.0\" p6=\"1.0\" p7=\"0.8\" p8=\"0.6\" p9=\"0.4\" p10=\"0.4\" p11=\"0.4\" p12=\"0.6\" p13=\"0.8\" p14=\"0.6\" p15=\"0.4\" p16=\"0.4\" p17=\"0.6\" p18=\"0.8\" p19=\"0.8\" p20=\"0.8\" p21=\"0.8\" p22=\"1.0\" p23=\"1.0\" p24=\"1.0\"/>\n");
					fw.write("<OccupancyDayProfile id=\"2\" p1=\"0.001\" p2=\"0.001\" p3=\"0.001\" p4=\"0.001\" p5=\"0.001\" p6=\"0.001\" p7=\"0.001\" p8=\"0.2\" p9=\"0.4\" p10=\"0.6\" p11=\"0.8\" p12=\"0.8\" p13=\"0.4\" p14=\"0.6\" p15=\"0.8\" p16=\"0.8\" p17=\"0.4\" p18=\"0.2\" p19=\"0.001\" p20=\"0.001\" p21=\"0.001\" p22=\"0.001\" p23=\"0.001\" p24=\"0.001\"/>\n");
					fw.write("<OccupancyDayProfile id=\"3\" p1=\"0.001\" p2=\"0.001\" p3=\"0.001\" p4=\"0.001\" p5=\"0.001\" p6=\"0.001\" p7=\"0.001\" p8=\"0.2\" p9=\"0.4\" p10=\"0.6\" p11=\"0.8\" p12=\"0.8\" p13=\"0.4\" p14=\"0.6\" p15=\"0.8\" p16=\"0.8\" p17=\"0.4\" p18=\"0.2\" p19=\"0.001\" p20=\"0.001\" p21=\"0.001\" p22=\"0.001\" p23=\"0.001\" p24=\"0.001\"/>\n");
					fw.write("<OccupancyDayProfile id=\"4\" p1=\"0.001\" p2=\"0.001\" p3=\"0.001\" p4=\"0.001\" p5=\"0.001\" p6=\"0.001\" p7=\"0.001\" p8=\"0.2\" p9=\"0.4\" p10=\"0.4\" p11=\"0.4\" p12=\"0.6\" p13=\"0.6\" p14=\"0.6\" p15=\"0.4\" p16=\"0.4\" p17=\"0.6\" p18=\"0.8\" p19=\"0.6\" p20=\"0.001\" p21=\"0.001\" p22=\"0.001\" p23=\"0.001\" p24=\"0.001\"/>\n");
					fw.write("<OccupancyDayProfile id=\"5\" p1=\"0.001\" p2=\"0.001\" p3=\"0.001\" p4=\"0.001\" p5=\"0.001\" p6=\"0.001\" p7=\"0.001\" p8=\"0.001\" p9=\"0.2\" p10=\"0.2\" p11=\"0.2\" p12=\"0.2\" p13=\"0.8\" p14=\"0.4\" p15=\"0.001\" p16=\"0.001\" p17=\"0.001\" p18=\"0.001\" p19=\"0.2\" p20=\"0.2\" p21=\"0.4\" p22=\"0.8\" p23=\"0.2\" p24=\"0.2\"/>\n");
					fw.write("<OccupancyDayProfile id=\"6\" p1=\"1.0\" p2=\"1.0\" p3=\"1.0\" p4=\"1.0\" p5=\"1.0\" p6=\"1.0\" p7=\"0.8\" p8=\"0.4\" p9=\"0.001\" p10=\"0.001\" p11=\"0.001\" p12=\"0.001\" p13=\"0.001\" p14=\"0.001\" p15=\"0.001\" p16=\"0.001\" p17=\"0.001\" p18=\"0.001\" p19=\"0.001\" p20=\"0.001\" p21=\"0.6\" p22=\"0.6\" p23=\"0.8\" p24=\"0.6\"/>\n");
					fw.write("<OccupancyDayProfile id=\"7\" p1=\"1.0\" p2=\"1.0\" p3=\"1.0\" p4=\"1.0\" p5=\"1.0\" p6=\"1.0\" p7=\"1.0\" p8=\"1.0\" p9=\"1.0\" p10=\"1.0\" p11=\"1.0\" p12=\"1.0\" p13=\"1.0\" p14=\"1.0\" p15=\"1.0\" p16=\"1.0\" p17=\"1.0\" p18=\"1.0\" p19=\"1.0\" p20=\"1.0\" p21=\"1.0\" p22=\"1.0\" p23=\"1.0\" p24=\"1.0\"/>\n");
					fw.write("<OccupancyDayProfile id=\"8\" p1=\"0.001\" p2=\"0.001\" p3=\"0.001\" p4=\"0.001\" p5=\"0.001\" p6=\"0.001\" p7=\"0.001\" p8=\"0.2\" p9=\"0.4\" p10=\"0.8\" p11=\"0.8\" p12=\"0.4\" p13=\"0.2\" p14=\"0.4\" p15=\"0.8\" p16=\"0.8\" p17=\"0.2\" p18=\"0.001\" p19=\"0.001\" p20=\"0.001\" p21=\"0.001\" p22=\"0.001\" p23=\"0.001\" p24=\"0.001\"/>\n");
					fw.write("<OccupancyDayProfile id=\"9\" p1=\"0.2\" p2=\"0.2\" p3=\"0.2\" p4=\"0.2\" p5=\"0.2\" p6=\".04\" p7=\"0.8\" p8=\"1.0\" p9=\"1.0\" p10=\"0.8\" p11=\"1.0\" p12=\"0.4\" p13=\"0.6\" p14=\"1.0\" p15=\"1.0\" p16=\"0.8\" p17=\"0.8\" p18=\"0.8\" p19=\"0.4\" p20=\"0.4\" p21=\"0.4\" p22=\"0.4\" p23=\"0.2\" p24=\"0.2\"/>\n");
					fw.write("<OccupancyDayProfile id=\"10\" p1=\"0.001\" p2=\"0.001\" p3=\"0.001\" p4=\"0.001\" p5=\"0.001\" p6=\"0.001\" p7=\"0.001\" p8=\"0.2\" p9=\"0.4\" p10=\"0.6\" p11=\"0.8\" p12=\"0.8\" p13=\"0.4\" p14=\"0.6\" p15=\"0.8\" p16=\"0.8\" p17=\"0.4\" p18=\"0.2\" p19=\"0.001\" p20=\"0.001\" p21=\"0.001\" p22=\"0.001\" p23=\"0.001\" p24=\"0.001\"/>\n");

					for(int i = 1; i <= 10; i++){
						if(i == 2){
							fw.write("<OccupancyYearProfile id=\""+(i)+"\" d1=\""+(i)+"\" d2=\""+(i)+"\" d3=\""+(i)+"\" d4=\""+(i)+"\" d5=\""+(i)+"\" d6=\"0\" d7=\"0\" d8=\""+(i)+"\" d9=\""+(i)+"\" d10=\""+(i)+"\" d11=\""+(i)+"\" d12=\""+(i)+"\" d13=\"0\" d14=\"0\" d15=\""+(i)+"\" d16=\""+(i)+"\" d17=\""+(i)+"\" d18=\""+(i)+"\" d19=\""+(i)+"\" d20=\"0\" d21=\"0\" d22=\""+(i)+"\" d23=\""+(i)+"\" d24=\""+(i)+"\" d25=\""+(i)+"\" d26=\""+(i)+"\" d27=\"0\" d28=\"0\" d29=\""+(i)+"\" d30=\""+(i)+"\" d31=\""+(i)+"\" d32=\""+(i)+"\" d33=\""+(i)+"\" d34=\"0\" d35=\"0\" d36=\""+(i)+"\" d37=\""+(i)+"\" d38=\""+(i)+"\" d39=\""+(i)+"\" d40=\""+(i)+"\" d41=\"0\" d42=\"0\" d43=\""+(i)+"\" d44=\""+(i)+"\" d45=\""+(i)+"\" d46=\""+(i)+"\" d47=\""+(i)+"\" d48=\"0\" d49=\"0\" d50=\""+(i)+"\" d51=\""+(i)+"\" d52=\""+(i)+"\" d53=\""+(i)+"\" d54=\""+(i)+"\" d55=\"0\" d56=\"0\" d57=\""+(i)+"\" d58=\""+(i)+"\" d59=\""+(i)+"\" d60=\""+(i)+"\" d61=\""+(i)+"\" d62=\"0\" d63=\"0\" d64=\""+(i)+"\" d65=\""+(i)+"\" d66=\""+(i)+"\" d67=\""+(i)+"\" d68=\""+(i)+"\" d69=\"0\" d70=\"0\" d71=\""+(i)+"\" d72=\""+(i)+"\" d73=\""+(i)+"\" d74=\""+(i)+"\" d75=\""+(i)+"\" d76=\"0\" d77=\"0\" d78=\""+(i)+"\" d79=\""+(i)+"\" d80=\""+(i)+"\" d81=\""+(i)+"\" d82=\""+(i)+"\" d83=\"0\" d84=\"0\" d85=\""+(i)+"\" d86=\""+(i)+"\" d87=\""+(i)+"\" d88=\""+(i)+"\" d89=\""+(i)+"\" d90=\"0\" d91=\"0\" d92=\""+(i)+"\" d93=\""+(i)+"\" d94=\""+(i)+"\" d95=\""+(i)+"\" d96=\""+(i)+"\" d97=\"0\" d98=\"0\" d99=\""+(i)+"\" d100=\""+(i)+"\" d101=\""+(i)+"\" d102=\""+(i)+"\" d103=\""+(i)+"\" d104=\"0\" d105=\"0\" d106=\""+(i)+"\" d107=\""+(i)+"\" d108=\""+(i)+"\" d109=\""+(i)+"\" d110=\""+(i)+"\" d111=\"0\" d112=\"0\" d113=\""+(i)+"\" d114=\""+(i)+"\" d115=\""+(i)+"\" d116=\""+(i)+"\" d117=\""+(i)+"\" d118=\"0\" d119=\"0\" d120=\""+(i)+"\" d121=\""+(i)+"\" d122=\""+(i)+"\" d123=\""+(i)+"\" d124=\""+(i)+"\" d125=\"0\" d126=\"0\" d127=\""+(i)+"\" d128=\""+(i)+"\" d129=\""+(i)+"\" d130=\""+(i)+"\" d131=\""+(i)+"\" d132=\"0\" d133=\"0\" d134=\""+(i)+"\" d135=\""+(i)+"\" d136=\""+(i)+"\" d137=\""+(i)+"\" d138=\""+(i)+"\" d139=\"0\" d140=\"0\" d141=\""+(i)+"\" d142=\""+(i)+"\" d143=\""+(i)+"\" d144=\""+(i)+"\" d145=\""+(i)+"\" d146=\"0\" d147=\"0\" d148=\""+(i)+"\" d149=\""+(i)+"\" d150=\""+(i)+"\" d151=\""+(i)+"\" d152=\""+(i)+"\" d153=\"0\" d154=\"0\" d155=\""+(i)+"\" d156=\""+(i)+"\" d157=\""+(i)+"\" d158=\""+(i)+"\" d159=\""+(i)+"\" d160=\"0\" d161=\"0\" d162=\""+(i)+"\" d163=\""+(i)+"\" d164=\""+(i)+"\" d165=\""+(i)+"\" d166=\""+(i)+"\" d167=\"0\" d168=\"0\" d169=\""+(i)+"\" d170=\""+(i)+"\" d171=\""+(i)+"\" d172=\""+(i)+"\" d173=\""+(i)+"\" d174=\"0\" d175=\"0\" d176=\""+(i)+"\" d177=\""+(i)+"\" d178=\""+(i)+"\" d179=\""+(i)+"\" d180=\""+(i)+"\" d181=\"0\" d182=\"0\" d183=\""+(i)+"\" d184=\""+(i)+"\" d185=\""+(i)+"\" d186=\""+(i)+"\" d187=\""+(i)+"\" d188=\"0\" d189=\"0\" d190=\""+(i)+"\" d191=\""+(i)+"\" d192=\""+(i)+"\" d193=\""+(i)+"\" d194=\""+(i)+"\" d195=\"0\" d196=\"0\" d197=\""+(i)+"\" d198=\""+(i)+"\" d199=\""+(i)+"\" d200=\""+(i)+"\" d201=\""+(i)+"\" d202=\"0\" d203=\"0\" d204=\""+(i)+"\" d205=\""+(i)+"\" d206=\""+(i)+"\" d207=\""+(i)+"\" d208=\""+(i)+"\" d209=\"0\" d210=\"0\" d211=\""+(i)+"\" d212=\""+(i)+"\" d213=\""+(i)+"\" d214=\""+(i)+"\" d215=\""+(i)+"\" d216=\"0\" d217=\"0\" d218=\""+(i)+"\" d219=\""+(i)+"\" d220=\""+(i)+"\" d221=\""+(i)+"\" d222=\""+(i)+"\" d223=\"0\" d224=\"0\" d225=\""+(i)+"\" d226=\""+(i)+"\" d227=\""+(i)+"\" d228=\""+(i)+"\" d229=\""+(i)+"\" d230=\"0\" d231=\"0\" d232=\""+(i)+"\" d233=\""+(i)+"\" d234=\""+(i)+"\" d235=\""+(i)+"\" d236=\""+(i)+"\" d237=\"0\" d238=\"0\" d239=\""+(i)+"\" d240=\""+(i)+"\" d241=\""+(i)+"\" d242=\""+(i)+"\" d243=\""+(i)+"\" d244=\"0\" d245=\"0\" d246=\""+(i)+"\" d247=\""+(i)+"\" d248=\""+(i)+"\" d249=\""+(i)+"\" d250=\""+(i)+"\" d251=\"0\" d252=\"0\" d253=\""+(i)+"\" d254=\""+(i)+"\" d255=\""+(i)+"\" d256=\""+(i)+"\" d257=\""+(i)+"\" d258=\"0\" d259=\"0\" d260=\""+(i)+"\" d261=\""+(i)+"\" d262=\""+(i)+"\" d263=\""+(i)+"\" d264=\""+(i)+"\" d265=\""+(i)+"\" d266=\"0\" d267=\"0\" d268=\""+(i)+"\" d269=\""+(i)+"\" d270=\""+(i)+"\" d271=\""+(i)+"\" d272=\""+(i)+"\" d273=\"0\" d274=\"0\" d275=\""+(i)+"\" d276=\""+(i)+"\" d277=\""+(i)+"\" d278=\""+(i)+"\" d279=\""+(i)+"\" d280=\"0\" d281=\"0\" d282=\""+(i)+"\" d283=\""+(i)+"\" d284=\""+(i)+"\" d285=\""+(i)+"\" d286=\""+(i)+"\" d287=\"0\" d288=\"0\" d289=\""+(i)+"\" d290=\""+(i)+"\" d291=\""+(i)+"\" d292=\""+(i)+"\" d293=\""+(i)+"\" d294=\"0\" d295=\"0\" d296=\""+(i)+"\" d297=\""+(i)+"\" d298=\""+(i)+"\" d299=\""+(i)+"\" d300=\""+(i)+"\" d301=\"0\" d302=\"0\" d303=\""+(i)+"\" d304=\""+(i)+"\" d305=\""+(i)+"\" d306=\""+(i)+"\" d307=\""+(i)+"\" d308=\"0\" d309=\"0\" d310=\""+(i)+"\" d311=\""+(i)+"\" d312=\""+(i)+"\" d313=\""+(i)+"\" d314=\""+(i)+"\" d315=\"0\" d316=\"0\" d317=\""+(i)+"\" d318=\""+(i)+"\" d319=\""+(i)+"\" d320=\""+(i)+"\" d321=\""+(i)+"\" d322=\"0\" d323=\"0\" d324=\""+(i)+"\" d325=\""+(i)+"\" d326=\""+(i)+"\" d327=\""+(i)+"\" d328=\""+(i)+"\" d329=\"0\" d330=\"0\" d331=\""+(i)+"\" d332=\""+(i)+"\" d333=\""+(i)+"\" d334=\""+(i)+"\" d335=\""+(i)+"\" d336=\"0\" d337=\"0\" d338=\""+(i)+"\" d339=\""+(i)+"\" d340=\""+(i)+"\" d341=\""+(i)+"\" d342=\""+(i)+"\" d343=\"0\" d344=\"0\" d345=\""+(i)+"\" d346=\""+(i)+"\" d347=\""+(i)+"\" d348=\""+(i)+"\" d349=\""+(i)+"\" d350=\"0\" d351=\"0\" d352=\""+(i)+"\" d353=\""+(i)+"\" d354=\""+(i)+"\" d355=\""+(i)+"\" d356=\""+(i)+"\" d357=\"0\" d358=\"0\" d359=\""+(i)+"\" d360=\""+(i)+"\" d361=\""+(i)+"\" d362=\""+(i)+"\" d363=\""+(i)+"\" d364=\"0\" d365=\"0\"/> \n");
						}else{
							fw.write("<OccupancyYearProfile id=\""+(i)+"\" d1=\""+(i)+"\" d2=\""+(i)+"\" d3=\""+(i)+"\" d4=\""+(i)+"\" d5=\""+(i)+"\" d6=\""+(i)+"\" d7=\""+(i)+"\" d8=\""+(i)+"\" d9=\""+(i)+"\" d10=\""+(i)+"\" d11=\""+(i)+"\" d12=\""+(i)+"\" d13=\""+(i)+"\" d14=\""+(i)+"\" d15=\""+(i)+"\" d16=\""+(i)+"\" d17=\""+(i)+"\" d18=\""+(i)+"\" d19=\""+(i)+"\" d20=\""+(i)+"\" d21=\""+(i)+"\" d22=\""+(i)+"\" d23=\""+(i)+"\" d24=\""+(i)+"\" d25=\""+(i)+"\" d26=\""+(i)+"\" d27=\""+(i)+"\" d28=\""+(i)+"\" d29=\""+(i)+"\" d30=\""+(i)+"\" d31=\""+(i)+"\" d32=\""+(i)+"\" d33=\""+(i)+"\" d34=\""+(i)+"\" d35=\""+(i)+"\" d36=\""+(i)+"\" d37=\""+(i)+"\" d38=\""+(i)+"\" d39=\""+(i)+"\" d40=\""+(i)+"\" d41=\""+(i)+"\" d42=\""+(i)+"\" d43=\""+(i)+"\" d44=\""+(i)+"\" d45=\""+(i)+"\" d46=\""+(i)+"\" d47=\""+(i)+"\" d48=\""+(i)+"\" d49=\""+(i)+"\" d50=\""+(i)+"\" d51=\""+(i)+"\" d52=\""+(i)+"\" d53=\""+(i)+"\" d54=\""+(i)+"\" d55=\""+(i)+"\" d56=\""+(i)+"\" d57=\""+(i)+"\" d58=\""+(i)+"\" d59=\""+(i)+"\" d60=\""+(i)+"\" d61=\""+(i)+"\" d62=\""+(i)+"\" d63=\""+(i)+"\" d64=\""+(i)+"\" d65=\""+(i)+"\" d66=\""+(i)+"\" d67=\""+(i)+"\" d68=\""+(i)+"\" d69=\""+(i)+"\" d70=\""+(i)+"\" d71=\""+(i)+"\" d72=\""+(i)+"\" d73=\""+(i)+"\" d74=\""+(i)+"\" d75=\""+(i)+"\" d76=\""+(i)+"\" d77=\""+(i)+"\" d78=\""+(i)+"\" d79=\""+(i)+"\" d80=\""+(i)+"\" d81=\""+(i)+"\" d82=\""+(i)+"\" d83=\""+(i)+"\" d84=\""+(i)+"\" d85=\""+(i)+"\" d86=\""+(i)+"\" d87=\""+(i)+"\" d88=\""+(i)+"\" d89=\""+(i)+"\" d90=\""+(i)+"\" d91=\""+(i)+"\" d92=\""+(i)+"\" d93=\""+(i)+"\" d94=\""+(i)+"\" d95=\""+(i)+"\" d96=\""+(i)+"\" d97=\""+(i)+"\" d98=\""+(i)+"\" d99=\""+(i)+"\" d100=\""+(i)+"\" d101=\""+(i)+"\" d102=\""+(i)+"\" d103=\""+(i)+"\" d104=\""+(i)+"\" d105=\""+(i)+"\" d106=\""+(i)+"\" d107=\""+(i)+"\" d108=\""+(i)+"\" d109=\""+(i)+"\" d110=\""+(i)+"\" d111=\""+(i)+"\" d112=\""+(i)+"\" d113=\""+(i)+"\" d114=\""+(i)+"\" d115=\""+(i)+"\" d116=\""+(i)+"\" d117=\""+(i)+"\" d118=\""+(i)+"\" d119=\""+(i)+"\" d120=\""+(i)+"\" d121=\""+(i)+"\" d122=\""+(i)+"\" d123=\""+(i)+"\" d124=\""+(i)+"\" d125=\""+(i)+"\" d126=\""+(i)+"\" d127=\""+(i)+"\" d128=\""+(i)+"\" d129=\""+(i)+"\" d130=\""+(i)+"\" d131=\""+(i)+"\" d132=\""+(i)+"\" d133=\""+(i)+"\" d134=\""+(i)+"\" d135=\""+(i)+"\" d136=\""+(i)+"\" d137=\""+(i)+"\" d138=\""+(i)+"\" d139=\""+(i)+"\" d140=\""+(i)+"\" d141=\""+(i)+"\" d142=\""+(i)+"\" d143=\""+(i)+"\" d144=\""+(i)+"\" d145=\""+(i)+"\" d146=\""+(i)+"\" d147=\""+(i)+"\" d148=\""+(i)+"\" d149=\""+(i)+"\" d150=\""+(i)+"\" d151=\""+(i)+"\" d152=\""+(i)+"\" d153=\""+(i)+"\" d154=\""+(i)+"\" d155=\""+(i)+"\" d156=\""+(i)+"\" d157=\""+(i)+"\" d158=\""+(i)+"\" d159=\""+(i)+"\" d160=\""+(i)+"\" d161=\""+(i)+"\" d162=\""+(i)+"\" d163=\""+(i)+"\" d164=\""+(i)+"\" d165=\""+(i)+"\" d166=\""+(i)+"\" d167=\""+(i)+"\" d168=\""+(i)+"\" d169=\""+(i)+"\" d170=\""+(i)+"\" d171=\""+(i)+"\" d172=\""+(i)+"\" d173=\""+(i)+"\" d174=\""+(i)+"\" d175=\""+(i)+"\" d176=\""+(i)+"\" d177=\""+(i)+"\" d178=\""+(i)+"\" d179=\""+(i)+"\" d180=\""+(i)+"\" d181=\""+(i)+"\" d182=\""+(i)+"\" d183=\""+(i)+"\" d184=\""+(i)+"\" d185=\""+(i)+"\" d186=\""+(i)+"\" d187=\""+(i)+"\" d188=\""+(i)+"\" d189=\""+(i)+"\" d190=\""+(i)+"\" d191=\""+(i)+"\" d192=\""+(i)+"\" d193=\""+(i)+"\" d194=\""+(i)+"\" d195=\""+(i)+"\" d196=\""+(i)+"\" d197=\""+(i)+"\" d198=\""+(i)+"\" d199=\""+(i)+"\" d200=\""+(i)+"\" d201=\""+(i)+"\" d202=\""+(i)+"\" d203=\""+(i)+"\" d204=\""+(i)+"\" d205=\""+(i)+"\" d206=\""+(i)+"\" d207=\""+(i)+"\" d208=\""+(i)+"\" d209=\""+(i)+"\" d210=\""+(i)+"\" d211=\""+(i)+"\" d212=\""+(i)+"\" d213=\""+(i)+"\" d214=\""+(i)+"\" d215=\""+(i)+"\" d216=\""+(i)+"\" d217=\""+(i)+"\" d218=\""+(i)+"\" d219=\""+(i)+"\" d220=\""+(i)+"\" d221=\""+(i)+"\" d222=\""+(i)+"\" d223=\""+(i)+"\" d224=\""+(i)+"\" d225=\""+(i)+"\" d226=\""+(i)+"\" d227=\""+(i)+"\" d228=\""+(i)+"\" d229=\""+(i)+"\" d230=\""+(i)+"\" d231=\""+(i)+"\" d232=\""+(i)+"\" d233=\""+(i)+"\" d234=\""+(i)+"\" d235=\""+(i)+"\" d236=\""+(i)+"\" d237=\""+(i)+"\" d238=\""+(i)+"\" d239=\""+(i)+"\" d240=\""+(i)+"\" d241=\""+(i)+"\" d242=\""+(i)+"\" d243=\""+(i)+"\" d244=\""+(i)+"\" d245=\""+(i)+"\" d246=\""+(i)+"\" d247=\""+(i)+"\" d248=\""+(i)+"\" d249=\""+(i)+"\" d250=\""+(i)+"\" d251=\""+(i)+"\" d252=\""+(i)+"\" d253=\""+(i)+"\" d254=\""+(i)+"\" d255=\""+(i)+"\" d256=\""+(i)+"\" d257=\""+(i)+"\" d258=\""+(i)+"\" d259=\""+(i)+"\" d260=\""+(i)+"\" d261=\""+(i)+"\" d262=\""+(i)+"\" d263=\""+(i)+"\" d264=\""+(i)+"\" d265=\""+(i)+"\" d266=\""+(i)+"\" d267=\""+(i)+"\" d268=\""+(i)+"\" d269=\""+(i)+"\" d270=\""+(i)+"\" d271=\""+(i)+"\" d272=\""+(i)+"\" d273=\""+(i)+"\" d274=\""+(i)+"\" d275=\""+(i)+"\" d276=\""+(i)+"\" d277=\""+(i)+"\" d278=\""+(i)+"\" d279=\""+(i)+"\" d280=\""+(i)+"\" d281=\""+(i)+"\" d282=\""+(i)+"\" d283=\""+(i)+"\" d284=\""+(i)+"\" d285=\""+(i)+"\" d286=\""+(i)+"\" d287=\""+(i)+"\" d288=\""+(i)+"\" d289=\""+(i)+"\" d290=\""+(i)+"\" d291=\""+(i)+"\" d292=\""+(i)+"\" d293=\""+(i)+"\" d294=\""+(i)+"\" d295=\""+(i)+"\" d296=\""+(i)+"\" d297=\""+(i)+"\" d298=\""+(i)+"\" d299=\""+(i)+"\" d300=\""+(i)+"\" d301=\""+(i)+"\" d302=\""+(i)+"\" d303=\""+(i)+"\" d304=\""+(i)+"\" d305=\""+(i)+"\" d306=\""+(i)+"\" d307=\""+(i)+"\" d308=\""+(i)+"\" d309=\""+(i)+"\" d310=\""+(i)+"\" d311=\""+(i)+"\" d312=\""+(i)+"\" d313=\""+(i)+"\" d314=\""+(i)+"\" d315=\""+(i)+"\" d316=\""+(i)+"\" d317=\""+(i)+"\" d318=\""+(i)+"\" d319=\""+(i)+"\" d320=\""+(i)+"\" d321=\""+(i)+"\" d322=\""+(i)+"\" d323=\""+(i)+"\" d324=\""+(i)+"\" d325=\""+(i)+"\" d326=\""+(i)+"\" d327=\""+(i)+"\" d328=\""+(i)+"\" d329=\""+(i)+"\" d330=\""+(i)+"\" d331=\""+(i)+"\" d332=\""+(i)+"\" d333=\""+(i)+"\" d334=\""+(i)+"\" d335=\""+(i)+"\" d336=\""+(i)+"\" d337=\""+(i)+"\" d338=\""+(i)+"\" d339=\""+(i)+"\" d340=\""+(i)+"\" d341=\""+(i)+"\" d342=\""+(i)+"\" d343=\""+(i)+"\" d344=\""+(i)+"\" d345=\""+(i)+"\" d346=\""+(i)+"\" d347=\""+(i)+"\" d348=\""+(i)+"\" d349=\""+(i)+"\" d350=\""+(i)+"\" d351=\""+(i)+"\" d352=\""+(i)+"\" d353=\""+(i)+"\" d354=\""+(i)+"\" d355=\""+(i)+"\" d356=\""+(i)+"\" d357=\""+(i)+"\" d358=\""+(i)+"\" d359=\""+(i)+"\" d360=\""+(i)+"\" d361=\""+(i)+"\" d362=\""+(i)+"\" d363=\""+(i)+"\" d364=\""+(i)+"\" d365=\""+(i)+"\"/> \n");
						}
					}
					//Device power and profile also estimated from the SIA norm. Each device represents the whole electrical load of each zone of the building.
					fw.write("<DeviceType id=\"1\" name=\"Residential\">\n");
					fw.write("<Device  name=\"Residential device\"  avgPower=\"190\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"0.1\" p2=\"0.1\" p3=\"0.1\" p4=\"0.1\" p5=\"0.1\" p6=\"0.1\" p7=\"0.625\" p8=\"1.666666667\" p9=\"1.25\" p10=\"1.25\" p11=\"1.25\" p12=\"1.666666667\" p13=\"1.25\" p14=\"0.833333333\" p15=\"1.25\" p16=\"1.25\" p17=\"1.666666667\" p18=\"1.25\" p19=\"1.25\" p20=\"1.25\" p21=\"0.625\" p22=\"0.5\" p23=\"0.5\" p24=\"0.1\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"2\" name=\"Office\">\n");
					fw.write("<Device  name=\"Office device\"  avgPower=\"130\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"100\" p2=\"100\" p3=\"100\" p4=\"100\" p5=\"100\" p6=\"100\" p7=\"100\" p8=\"1\" p9=\"1\" p10=\"1\" p11=\"1\" p12=\"1\" p13=\"1\" p14=\"1\" p15=\"1\" p16=\"1\" p17=\"1\" p18=\"1\" p19=\"100\" p20=\"100\" p21=\"100\" p22=\"100\" p23=\"100\" p24=\"100\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"3\" name=\"Garage\">\n");
					fw.write("<Device  name=\"Garage device\"  avgPower=\"90\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"100\" p2=\"100\" p3=\"100\" p4=\"100\" p5=\"100\" p6=\"100\" p7=\"100\" p8=\"1\" p9=\"1\" p10=\"1\" p11=\"1\" p12=\"1\" p13=\"1\" p14=\"1\" p15=\"1\" p16=\"1\" p17=\"1\" p18=\"1\" p19=\"100\" p20=\"100\" p21=\"100\" p22=\"100\" p23=\"100\" p24=\"100\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"4\" name=\"Commercial\">\n");
					fw.write("<Device  name=\"Commercial device\"  avgPower=\"20\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"1\" p2=\"1\" p3=\"1\" p4=\"1\" p5=\"1\" p6=\"1\" p7=\"1\" p8=\"5\" p9=\"2.5\" p10=\"2.5\" p11=\"2.5\" p12=\"1.666666667\" p13=\"1.666666667\" p14=\"1.666666667\" p15=\"2.5\" p16=\"2.5\" p17=\"1.666666667\" p18=\"1.25\" p19=\"1.666666667\" p20=\"1\" p21=\"1\" p22=\"1\" p23=\"1\" p24=\"1\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"5\" name=\"Restaurant\">\n");
					fw.write("<Device  name=\"Restaurant device\"  avgPower=\"4\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"100\" p2=\"100\" p3=\"100\" p4=\"100\" p5=\"100\" p6=\"100\" p7=\"100\" p8=\"100\" p9=\"2\" p10=\"2\" p11=\"2\" p12=\"2\" p13=\"1.25\" p14=\"2.5\" p15=\"100\" p16=\"100\" p17=\"100\" p18=\"100\" p19=\"2\" p20=\"2\" p21=\"1\" p22=\"1.25\" p23=\"4\" p24=\"2\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"6\" name=\"Hotel\">\n");
					fw.write("<Device  name=\"Hotel device\"  avgPower=\"68\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"1\" p2=\"0.4\" p3=\"0.4\" p4=\"0.4\" p5=\"0.4\" p6=\"0.4\" p7=\"0.5\" p8=\"1\" p9=\"400\" p10=\"400\" p11=\"400\" p12=\"400\" p13=\"400\" p14=\"400\" p15=\"400\" p16=\"400\" p17=\"400\" p18=\"400\" p19=\"400\" p20=\"400\" p21=\"0.666666667\" p22=\"1\" p23=\"1\" p24=\"1.666666667\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"7\" name=\"Hospital\">\n");
					fw.write("<Device  name=\"Hospital device\"  avgPower=\"60\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"0.2\" p2=\"0.2\" p3=\"0.2\" p4=\"0.2\" p5=\"0.2\" p6=\"0.2\" p7=\"0.2\" p8=\"0.2\" p9=\"0.2\" p10=\"0.2\" p11=\"0.2\" p12=\"0.2\" p13=\"0.2\" p14=\"0.2\" p15=\"0.2\" p16=\"0.2\" p17=\"0.2\" p18=\"0.2\" p19=\"0.2\" p20=\"0.8\" p21=\"0.6\" p22=\"0.4\" p23=\"0.2\" p24=\"0.2\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"8\" name=\"Education\">\n");
					fw.write("<Device  name=\"Education device\"  avgPower=\"40\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"100\" p2=\"100\" p3=\"100\" p4=\"100\" p5=\"100\" p6=\"100\" p7=\"100\" p8=\"1\" p9=\"1\" p10=\"1\" p11=\"1\" p12=\"1\" p13=\"1\" p14=\"1\" p15=\"1\" p16=\"1\" p17=\"1\" p18=\"100\" p19=\"100\" p20=\"100\" p21=\"100\" p22=\"100\" p23=\"100\" p24=\"100\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"9\" name=\"Industrial\">\n");
					fw.write("<Device  name=\"Industrial device\"  avgPower=\"300\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"0.5\" p2=\"0.5\" p3=\"0.5\" p4=\"0.5\" p5=\"0.5\" p6=\"12.5\" p7=\"1\" p8=\"1\" p9=\"1\" p10=\"1\" p11=\"1\" p12=\"1.25\" p13=\"1.333333333\" p14=\"1\" p15=\"1\" p16=\"1\" p17=\"1\" p18=\"1\" p19=\"1.25\" p20=\"1.25\" p21=\"1.25\" p22=\"1.25\" p23=\"1\" p24=\"1\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"10\" name=\"Other\">\n");
					fw.write("<Device name=\"Other device\"  avgPower=\"130\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"100\" p2=\"100\" p3=\"100\" p4=\"100\" p5=\"100\" p6=\"100\" p7=\"100\" p8=\"1\" p9=\"1\" p10=\"1\" p11=\"1\" p12=\"1\" p13=\"1\" p14=\"1\" p15=\"1\" p16=\"1\" p17=\"1\" p18=\"1\" p19=\"100\" p20=\"100\" p21=\"100\" p22=\"100\" p23=\"100\" p24=\"100\"/>\n");
					fw.write("</DeviceType>\n");
					fw.write("<DeviceType id=\"11\" name=\"Othe\">\n");
					fw.write("<Device name=\"Othe device\"  avgPower=\"0.1\"  convectiveFraction=\"0.8\" radiativeFraction=\"0.1\" p1=\"100\" p2=\"100\" p3=\"100\" p4=\"100\" p5=\"100\" p6=\"100\" p7=\"100\" p8=\"1\" p9=\"1\" p10=\"1\" p11=\"1\" p12=\"1\" p13=\"1\" p14=\"1\" p15=\"1\" p16=\"1\" p17=\"1\" p18=\"1\" p19=\"100\" p20=\"100\" p21=\"100\" p22=\"100\" p23=\"100\" p24=\"100\"/>\n");
					fw.write("</DeviceType>\n");
					//People coeff is a multiplier that can be used to increase or decrease the number of occupants as a function of the type of building
					double[] peopleCoeff = {1,1,1,1,1,1,1,1,1,1};
					//Multipliers for the natural ventilation and the ventilation rate from the SIA.
					double[] natVentilationCoeff = {1.0665,0.6054,1,0.525, 1.05725,0.9703,1,0.5421,1,0.44}; //Ventilation rates based on the values provided by Diane's thesis after calibration

					double[] ventilationCoeff = {1.7365,0.6687,1,0.6,0.8145,1.59055,1,0.62807,1,0.36}; //Ventilation rate based on the values provided by the SIA norm
					for(int i = 1; i <= 10; i++){
						fw.write("<ActivityType id=\""+ (i) +"\" name=\"Standard\">\n");
						fw.write("<Activity name=\"Standard\" p1=\"1.0\" p2=\"1.0\" p3=\"1.0\" p4=\"1.0\" p5=\"1.0\" p6=\"1.0\" p7=\"1.0\" p8=\"1.0\" p9=\"1.0\" p10=\"1.0\" p11=\"1.0\" p12=\"1.0\" p13=\"1.0\" p14=\"1.0\" p15=\"1.0\" p16=\"1.0\" p17=\"1.0\" p18=\"1.0\" p19=\"1.0\" p20=\"1.0\" p21=\"1.0\" p22=\"1.0\" p23=\"1.0\" p24=\"1.0\" deviceType=\""+ (i) +"\"/>\n");
						fw.write("</ActivityType>\n");
					}
					fw.write("<ActivityType id=\"11\" name=\"Standard\">\n");
					fw.write("<Activity name=\"Standard\" p1=\"0.0\" p2=\"0.0\" p3=\"0.0\" p4=\"0.0\" p5=\"0.0\" p6=\"0.0\" p7=\"0.0\" p8=\"0.0\" p9=\"0.0\" p10=\"0.0\" p11=\"0.0\" p12=\"0.0\" p13=\"0.0\" p14=\"0.0\" p15=\"0.0\" p16=\"0.0\" p17=\"0.0\" p18=\"0.0\" p19=\"0.0\" p20=\"0.0\" p21=\"0.0\" p22=\"0.0\" p23=\"0.0\" p24=\"0.0\" deviceType=\"11\"/>\n");
					fw.write("</ActivityType>\n");
					// fw.write("<DHWDayProfile id=\"1\" name=\" IEA task 26 DHW profile\" waterConsumption=\"50.0\" p1=\"0.01\" p2=\"0.01\" p3=\"0.01\" p4=\"0.01\" p5=\"0.4\" p6=\"0.07\" p7=\"0.16\" p8=\"0.12\" p9=\"0.10\" p10=\"0.09\" p11=\"0.10\" p12=\"0.07\" p13=\"0.05\" p14=\"0.07\" p15=\"0.10\" p16=\"0.10\" p17=\"0.07\" p18=\"0.06\" p19=\"0.10\" p20=\"0.09\" p21=\"0.05\" p22=\"0.04\" p23=\"0.01\" p24=\"0.01\"/>\n");
					// fw.write("<DHWYearProfile id=\"1\" name=\"IEA task 26 Profile House\" d1=\"1\" d2=\"1\" d3=\"1\" d4=\"1\" d5=\"1\" d6=\"1\" d7=\"1\" d8=\"1\" d9=\"1\" d10=\"1\" d11=\"1\" d12=\"1\" d13=\"1\" d14=\"1\" d15=\"1\" d16=\"1\" d17=\"1\" d18=\"1\" d19=\"1\" d20=\"1\" d21=\"1\" d22=\"1\" d23=\"1\" d24=\"1\" d25=\"1\" d26=\"1\" d27=\"1\" d28=\"1\" d29=\"1\" d30=\"1\" d31=\"1\" d32=\"1\" d33=\"1\" d34=\"1\" d35=\"1\" d36=\"1\" d37=\"1\" d38=\"1\" d39=\"1\" d40=\"1\" d41=\"1\" d42=\"1\" d43=\"1\" d44=\"1\" d45=\"1\" d46=\"1\" d47=\"1\" d48=\"1\" d49=\"1\" d50=\"1\" d51=\"1\" d52=\"1\" d53=\"1\" d54=\"1\" d55=\"1\" d56=\"1\" d57=\"1\" d58=\"1\" d59=\"1\" d60=\"1\" d61=\"1\" d62=\"1\" d63=\"1\" d64=\"1\" d65=\"1\" d66=\"1\" d67=\"1\" d68=\"1\" d69=\"1\" d70=\"1\" d71=\"1\" d72=\"1\" d73=\"1\" d74=\"1\" d75=\"1\" d76=\"1\" d77=\"1\" d78=\"1\" d79=\"1\" d80=\"1\" d81=\"1\" d82=\"1\" d83=\"1\" d84=\"1\" d85=\"1\" d86=\"1\" d87=\"1\" d88=\"1\" d89=\"1\" d90=\"1\" d91=\"1\" d92=\"1\" d93=\"1\" d94=\"1\" d95=\"1\" d96=\"1\" d97=\"1\" d98=\"1\" d99=\"1\" d100=\"1\" d101=\"1\" d102=\"1\" d103=\"1\" d104=\"1\" d105=\"1\" d106=\"1\" d107=\"1\" d108=\"1\" d109=\"1\" d110=\"1\" d111=\"1\" d112=\"1\" d113=\"1\" d114=\"1\" d115=\"1\" d116=\"1\" d117=\"1\" d118=\"1\" d119=\"1\" d120=\"1\" d121=\"1\" d122=\"1\" d123=\"1\" d124=\"1\" d125=\"1\" d126=\"1\" d127=\"1\" d128=\"1\" d129=\"1\" d130=\"1\" d131=\"1\" d132=\"1\" d133=\"1\" d134=\"1\" d135=\"1\" d136=\"1\" d137=\"1\" d138=\"1\" d139=\"1\" d140=\"1\" d141=\"1\" d142=\"1\" d143=\"1\" d144=\"1\" d145=\"1\" d146=\"1\" d147=\"1\" d148=\"1\" d149=\"1\" d150=\"1\" d151=\"1\" d152=\"1\" d153=\"1\" d154=\"1\" d155=\"1\" d156=\"1\" d157=\"1\" d158=\"1\" d159=\"1\" d160=\"1\" d161=\"1\" d162=\"1\" d163=\"1\" d164=\"1\" d165=\"1\" d166=\"1\" d167=\"1\" d168=\"1\" d169=\"1\" d170=\"1\" d171=\"1\" d172=\"1\" d173=\"1\" d174=\"1\" d175=\"1\" d176=\"1\" d177=\"1\" d178=\"1\" d179=\"1\" d180=\"1\" d181=\"1\" d182=\"1\" d183=\"1\" d184=\"1\" d185=\"1\" d186=\"1\" d187=\"1\" d188=\"1\" d189=\"1\" d190=\"1\" d191=\"1\" d192=\"1\" d193=\"1\" d194=\"1\" d195=\"1\" d196=\"1\" d197=\"1\" d198=\"1\" d199=\"1\" d200=\"1\" d201=\"1\" d202=\"1\" d203=\"1\" d204=\"1\" d205=\"1\" d206=\"1\" d207=\"1\" d208=\"1\" d209=\"1\" d210=\"1\" d211=\"1\" d212=\"1\" d213=\"1\" d214=\"1\" d215=\"1\" d216=\"1\" d217=\"1\" d218=\"1\" d219=\"1\" d220=\"1\" d221=\"1\" d222=\"1\" d223=\"1\" d224=\"1\" d225=\"1\" d226=\"1\" d227=\"1\" d228=\"1\" d229=\"1\" d230=\"1\" d231=\"1\" d232=\"1\" d233=\"1\" d234=\"1\" d235=\"1\" d236=\"1\" d237=\"1\" d238=\"1\" d239=\"1\" d240=\"1\" d241=\"1\" d242=\"1\" d243=\"1\" d244=\"1\" d245=\"1\" d246=\"1\" d247=\"1\" d248=\"1\" d249=\"1\" d250=\"1\" d251=\"1\" d252=\"1\" d253=\"1\" d254=\"1\" d255=\"1\" d256=\"1\" d257=\"1\" d258=\"1\" d259=\"1\" d260=\"1\" d261=\"1\" d262=\"1\" d263=\"1\" d264=\"1\" d265=\"1\" d266=\"1\" d267=\"1\" d268=\"1\" d269=\"1\" d270=\"1\" d271=\"1\" d272=\"1\" d273=\"1\" d274=\"1\" d275=\"1\" d276=\"1\" d277=\"1\" d278=\"1\" d279=\"1\" d280=\"1\" d281=\"1\" d282=\"1\" d283=\"1\" d284=\"1\" d285=\"1\" d286=\"1\" d287=\"1\" d288=\"1\" d289=\"1\" d290=\"1\" d291=\"1\" d292=\"1\" d293=\"1\" d294=\"1\" d295=\"1\" d296=\"1\" d297=\"1\" d298=\"1\" d299=\"1\" d300=\"1\" d301=\"1\" d302=\"1\" d303=\"1\" d304=\"1\" d305=\"1\" d306=\"1\" d307=\"1\" d308=\"1\" d309=\"1\" d310=\"1\" d311=\"1\" d312=\"1\" d313=\"1\" d314=\"1\" d315=\"1\" d316=\"1\" d317=\"1\" d318=\"1\" d319=\"1\" d320=\"1\" d321=\"1\" d322=\"1\" d323=\"1\" d324=\"1\" d325=\"1\" d326=\"1\" d327=\"1\" d328=\"1\" d329=\"1\" d330=\"1\" d331=\"1\" d332=\"1\" d333=\"1\" d334=\"1\" d335=\"1\" d336=\"1\" d337=\"1\" d338=\"1\" d339=\"1\" d340=\"1\" d341=\"1\" d342=\"1\" d343=\"1\" d344=\"1\" d345=\"1\" d346=\"1\" d347=\"1\" d348=\"1\" d349=\"1\" d350=\"1\" d351=\"1\" d352=\"1\" d353=\"1\" d354=\"1\" d355=\"1\" d356=\"1\" d357=\"1\" d358=\"1\" d359=\"1\" d360=\"1\" d361=\"1\" d362=\"1\" d363=\"1\" d364=\"1\" d365=\"1\"/>\n");

					//Occupancy profiles
					fw.write("<DHWDayProfile id=\"1\" name=\" IEA task 26 DHW profile 1\" waterConsumption=\"50.0\" p1=\"0.01\" p2=\"0.01\" p3=\"0.01\" p4=\"0.01\" p5=\"0.4\" p6=\"0.07\" p7=\"0.16\" p8=\"0.12\" p9=\"0.10\" p10=\"0.09\" p11=\"0.10\" p12=\"0.07\" p13=\"0.05\" p14=\"0.07\" p15=\"0.10\" p16=\"0.10\" p17=\"0.07\" p18=\"0.06\" p19=\"0.10\" p20=\"0.09\" p21=\"0.05\" p22=\"0.04\" p23=\"0.01\" p24=\"0.01\"/>\n");
					fw.write("<DHWDayProfile id=\"2\" name=\" IEA task 26 DHW profile 2\" waterConsumption=\"0.0\" p1=\"0.0\" p2=\"0.0\" p3=\"0.0\" p4=\"0.0\" p5=\"0.0\" p6=\"0.0\" p7=\"0.0\" p8=\"0.0\" p9=\"0.0\" p10=\"0.0\" p11=\"0.0\" p12=\"0.0\" p13=\"0.0\" p14=\"0.0\" p15=\"0.0\" p16=\"0.0\" p17=\"0.0\" p18=\"0.0\" p19=\"0.0\" p20=\"0.0\" p21=\"0.0\" p22=\"0.0\" p23=\"0.0\" p24=\"0.0\"/>\n");
					fw.write("<DHWYearProfile id=\"1\" name=\"IEA task 26 Profile House 1\" d1=\"1\" d2=\"1\" d3=\"1\" d4=\"1\" d5=\"1\" d6=\"1\" d7=\"1\" d8=\"1\" d9=\"1\" d10=\"1\" d11=\"1\" d12=\"1\" d13=\"1\" d14=\"1\" d15=\"1\" d16=\"1\" d17=\"1\" d18=\"1\" d19=\"1\" d20=\"1\" d21=\"1\" d22=\"1\" d23=\"1\" d24=\"1\" d25=\"1\" d26=\"1\" d27=\"1\" d28=\"1\" d29=\"1\" d30=\"1\" d31=\"1\" d32=\"1\" d33=\"1\" d34=\"1\" d35=\"1\" d36=\"1\" d37=\"1\" d38=\"1\" d39=\"1\" d40=\"1\" d41=\"1\" d42=\"1\" d43=\"1\" d44=\"1\" d45=\"1\" d46=\"1\" d47=\"1\" d48=\"1\" d49=\"1\" d50=\"1\" d51=\"1\" d52=\"1\" d53=\"1\" d54=\"1\" d55=\"1\" d56=\"1\" d57=\"1\" d58=\"1\" d59=\"1\" d60=\"1\" d61=\"1\" d62=\"1\" d63=\"1\" d64=\"1\" d65=\"1\" d66=\"1\" d67=\"1\" d68=\"1\" d69=\"1\" d70=\"1\" d71=\"1\" d72=\"1\" d73=\"1\" d74=\"1\" d75=\"1\" d76=\"1\" d77=\"1\" d78=\"1\" d79=\"1\" d80=\"1\" d81=\"1\" d82=\"1\" d83=\"1\" d84=\"1\" d85=\"1\" d86=\"1\" d87=\"1\" d88=\"1\" d89=\"1\" d90=\"1\" d91=\"1\" d92=\"1\" d93=\"1\" d94=\"1\" d95=\"1\" d96=\"1\" d97=\"1\" d98=\"1\" d99=\"1\" d100=\"1\" d101=\"1\" d102=\"1\" d103=\"1\" d104=\"1\" d105=\"1\" d106=\"1\" d107=\"1\" d108=\"1\" d109=\"1\" d110=\"1\" d111=\"1\" d112=\"1\" d113=\"1\" d114=\"1\" d115=\"1\" d116=\"1\" d117=\"1\" d118=\"1\" d119=\"1\" d120=\"1\" d121=\"1\" d122=\"1\" d123=\"1\" d124=\"1\" d125=\"1\" d126=\"1\" d127=\"1\" d128=\"1\" d129=\"1\" d130=\"1\" d131=\"1\" d132=\"1\" d133=\"1\" d134=\"1\" d135=\"1\" d136=\"1\" d137=\"1\" d138=\"1\" d139=\"1\" d140=\"1\" d141=\"1\" d142=\"1\" d143=\"1\" d144=\"1\" d145=\"1\" d146=\"1\" d147=\"1\" d148=\"1\" d149=\"1\" d150=\"1\" d151=\"1\" d152=\"1\" d153=\"1\" d154=\"1\" d155=\"1\" d156=\"1\" d157=\"1\" d158=\"1\" d159=\"1\" d160=\"1\" d161=\"1\" d162=\"1\" d163=\"1\" d164=\"1\" d165=\"1\" d166=\"1\" d167=\"1\" d168=\"1\" d169=\"1\" d170=\"1\" d171=\"1\" d172=\"1\" d173=\"1\" d174=\"1\" d175=\"1\" d176=\"1\" d177=\"1\" d178=\"1\" d179=\"1\" d180=\"1\" d181=\"1\" d182=\"1\" d183=\"1\" d184=\"1\" d185=\"1\" d186=\"1\" d187=\"1\" d188=\"1\" d189=\"1\" d190=\"1\" d191=\"1\" d192=\"1\" d193=\"1\" d194=\"1\" d195=\"1\" d196=\"1\" d197=\"1\" d198=\"1\" d199=\"1\" d200=\"1\" d201=\"1\" d202=\"1\" d203=\"1\" d204=\"1\" d205=\"1\" d206=\"1\" d207=\"1\" d208=\"1\" d209=\"1\" d210=\"1\" d211=\"1\" d212=\"1\" d213=\"1\" d214=\"1\" d215=\"1\" d216=\"1\" d217=\"1\" d218=\"1\" d219=\"1\" d220=\"1\" d221=\"1\" d222=\"1\" d223=\"1\" d224=\"1\" d225=\"1\" d226=\"1\" d227=\"1\" d228=\"1\" d229=\"1\" d230=\"1\" d231=\"1\" d232=\"1\" d233=\"1\" d234=\"1\" d235=\"1\" d236=\"1\" d237=\"1\" d238=\"1\" d239=\"1\" d240=\"1\" d241=\"1\" d242=\"1\" d243=\"1\" d244=\"1\" d245=\"1\" d246=\"1\" d247=\"1\" d248=\"1\" d249=\"1\" d250=\"1\" d251=\"1\" d252=\"1\" d253=\"1\" d254=\"1\" d255=\"1\" d256=\"1\" d257=\"1\" d258=\"1\" d259=\"1\" d260=\"1\" d261=\"1\" d262=\"1\" d263=\"1\" d264=\"1\" d265=\"1\" d266=\"1\" d267=\"1\" d268=\"1\" d269=\"1\" d270=\"1\" d271=\"1\" d272=\"1\" d273=\"1\" d274=\"1\" d275=\"1\" d276=\"1\" d277=\"1\" d278=\"1\" d279=\"1\" d280=\"1\" d281=\"1\" d282=\"1\" d283=\"1\" d284=\"1\" d285=\"1\" d286=\"1\" d287=\"1\" d288=\"1\" d289=\"1\" d290=\"1\" d291=\"1\" d292=\"1\" d293=\"1\" d294=\"1\" d295=\"1\" d296=\"1\" d297=\"1\" d298=\"1\" d299=\"1\" d300=\"1\" d301=\"1\" d302=\"1\" d303=\"1\" d304=\"1\" d305=\"1\" d306=\"1\" d307=\"1\" d308=\"1\" d309=\"1\" d310=\"1\" d311=\"1\" d312=\"1\" d313=\"1\" d314=\"1\" d315=\"1\" d316=\"1\" d317=\"1\" d318=\"1\" d319=\"1\" d320=\"1\" d321=\"1\" d322=\"1\" d323=\"1\" d324=\"1\" d325=\"1\" d326=\"1\" d327=\"1\" d328=\"1\" d329=\"1\" d330=\"1\" d331=\"1\" d332=\"1\" d333=\"1\" d334=\"1\" d335=\"1\" d336=\"1\" d337=\"1\" d338=\"1\" d339=\"1\" d340=\"1\" d341=\"1\" d342=\"1\" d343=\"1\" d344=\"1\" d345=\"1\" d346=\"1\" d347=\"1\" d348=\"1\" d349=\"1\" d350=\"1\" d351=\"1\" d352=\"1\" d353=\"1\" d354=\"1\" d355=\"1\" d356=\"1\" d357=\"1\" d358=\"1\" d359=\"1\" d360=\"1\" d361=\"1\" d362=\"1\" d363=\"1\" d364=\"1\" d365=\"1\"/>\n");
					fw.write("<DHWYearProfile id=\"2\" name=\"IEA task 26 Profile House 2\" d1=\"2\" d2=\"2\" d3=\"2\" d4=\"2\" d5=\"2\" d6=\"2\" d7=\"2\" d8=\"2\" d9=\"2\" d10=\"2\" d11=\"2\" d12=\"2\" d13=\"2\" d14=\"2\" d15=\"2\" d16=\"2\" d17=\"2\" d18=\"2\" d19=\"2\" d20=\"2\" d21=\"2\" d22=\"2\" d23=\"2\" d24=\"2\" d25=\"2\" d26=\"2\" d27=\"2\" d28=\"2\" d29=\"2\" d30=\"2\" d31=\"2\" d32=\"2\" d33=\"2\" d34=\"2\" d35=\"2\" d36=\"2\" d37=\"2\" d38=\"2\" d39=\"2\" d40=\"2\" d41=\"2\" d42=\"2\" d43=\"2\" d44=\"2\" d45=\"2\" d46=\"2\" d47=\"2\" d48=\"2\" d49=\"2\" d50=\"2\" d51=\"2\" d52=\"2\" d53=\"2\" d54=\"2\" d55=\"2\" d56=\"2\" d57=\"2\" d58=\"2\" d59=\"2\" d60=\"2\" d61=\"2\" d62=\"2\" d63=\"2\" d64=\"2\" d65=\"2\" d66=\"2\" d67=\"2\" d68=\"2\" d69=\"2\" d70=\"2\" d71=\"2\" d72=\"2\" d73=\"2\" d74=\"2\" d75=\"2\" d76=\"2\" d77=\"2\" d78=\"2\" d79=\"2\" d80=\"2\" d81=\"2\" d82=\"2\" d83=\"2\" d84=\"2\" d85=\"2\" d86=\"2\" d87=\"2\" d88=\"2\" d89=\"2\" d90=\"2\" d91=\"2\" d92=\"2\" d93=\"2\" d94=\"2\" d95=\"2\" d96=\"2\" d97=\"2\" d98=\"2\" d99=\"2\" d100=\"2\" d101=\"2\" d102=\"2\" d103=\"2\" d104=\"2\" d105=\"2\" d106=\"2\" d107=\"2\" d108=\"2\" d109=\"2\" d110=\"2\" d111=\"2\" d112=\"2\" d113=\"2\" d114=\"2\" d115=\"2\" d116=\"2\" d117=\"2\" d118=\"2\" d119=\"2\" d120=\"2\" d121=\"2\" d122=\"2\" d123=\"2\" d124=\"2\" d125=\"2\" d126=\"2\" d127=\"2\" d128=\"2\" d129=\"2\" d130=\"2\" d131=\"2\" d132=\"2\" d133=\"2\" d134=\"2\" d135=\"2\" d136=\"2\" d137=\"2\" d138=\"2\" d139=\"2\" d140=\"2\" d141=\"2\" d142=\"2\" d143=\"2\" d144=\"2\" d145=\"2\" d146=\"2\" d147=\"2\" d148=\"2\" d149=\"2\" d150=\"2\" d151=\"2\" d152=\"2\" d153=\"2\" d154=\"2\" d155=\"2\" d156=\"2\" d157=\"2\" d158=\"2\" d159=\"2\" d160=\"2\" d161=\"2\" d162=\"2\" d163=\"2\" d164=\"2\" d165=\"2\" d166=\"2\" d167=\"2\" d168=\"2\" d169=\"2\" d170=\"2\" d171=\"2\" d172=\"2\" d173=\"2\" d174=\"2\" d175=\"2\" d176=\"2\" d177=\"2\" d178=\"2\" d179=\"2\" d180=\"2\" d181=\"2\" d182=\"2\" d183=\"2\" d184=\"2\" d185=\"2\" d186=\"2\" d187=\"2\" d188=\"2\" d189=\"2\" d190=\"2\" d191=\"2\" d192=\"2\" d193=\"2\" d194=\"2\" d195=\"2\" d196=\"2\" d197=\"2\" d198=\"2\" d199=\"2\" d200=\"2\" d201=\"2\" d202=\"2\" d203=\"2\" d204=\"2\" d205=\"2\" d206=\"2\" d207=\"2\" d208=\"2\" d209=\"2\" d210=\"2\" d211=\"2\" d212=\"2\" d213=\"2\" d214=\"2\" d215=\"2\" d216=\"2\" d217=\"2\" d218=\"2\" d219=\"2\" d220=\"2\" d221=\"2\" d222=\"2\" d223=\"2\" d224=\"2\" d225=\"2\" d226=\"2\" d227=\"2\" d228=\"2\" d229=\"2\" d230=\"2\" d231=\"2\" d232=\"2\" d233=\"2\" d234=\"2\" d235=\"2\" d236=\"2\" d237=\"2\" d238=\"2\" d239=\"2\" d240=\"2\" d241=\"2\" d242=\"2\" d243=\"2\" d244=\"2\" d245=\"2\" d246=\"2\" d247=\"2\" d248=\"2\" d249=\"2\" d250=\"2\" d251=\"2\" d252=\"2\" d253=\"2\" d254=\"2\" d255=\"2\" d256=\"2\" d257=\"2\" d258=\"2\" d259=\"2\" d260=\"2\" d261=\"2\" d262=\"2\" d263=\"2\" d264=\"2\" d265=\"2\" d266=\"2\" d267=\"2\" d268=\"2\" d269=\"2\" d270=\"2\" d271=\"2\" d272=\"2\" d273=\"2\" d274=\"2\" d275=\"2\" d276=\"2\" d277=\"2\" d278=\"2\" d279=\"2\" d280=\"2\" d281=\"2\" d282=\"2\" d283=\"2\" d284=\"2\" d285=\"2\" d286=\"2\" d287=\"2\" d288=\"2\" d289=\"2\" d290=\"2\" d291=\"2\" d292=\"2\" d293=\"2\" d294=\"2\" d295=\"2\" d296=\"2\" d297=\"2\" d298=\"2\" d299=\"2\" d300=\"2\" d301=\"2\" d302=\"2\" d303=\"2\" d304=\"2\" d305=\"2\" d306=\"2\" d307=\"2\" d308=\"2\" d309=\"2\" d310=\"2\" d311=\"2\" d312=\"2\" d313=\"2\" d314=\"2\" d315=\"2\" d316=\"2\" d317=\"2\" d318=\"2\" d319=\"2\" d320=\"2\" d321=\"2\" d322=\"2\" d323=\"2\" d324=\"2\" d325=\"2\" d326=\"2\" d327=\"2\" d328=\"2\" d329=\"2\" d330=\"2\" d331=\"2\" d332=\"2\" d333=\"2\" d334=\"2\" d335=\"2\" d336=\"2\" d337=\"2\" d338=\"2\" d339=\"2\" d340=\"2\" d341=\"2\" d342=\"2\" d343=\"2\" d344=\"2\" d345=\"2\" d346=\"2\" d347=\"2\" d348=\"2\" d349=\"2\" d350=\"2\" d351=\"2\" d352=\"2\" d353=\"2\" d354=\"2\" d355=\"2\" d356=\"2\" d357=\"2\" d358=\"2\" d359=\"2\" d360=\"2\" d361=\"2\" d362=\"2\" d363=\"2\" d364=\"2\" d365=\"2\"/>\n");
					//Buildings classified as Office have 0 occupants on the weekends.
					for(int i = 1; i <= 10; i++){
						if(i == 2){
							fw.write("<OccupancyYearProfile id=\""+(i)+"\" d1=\""+(i)+"\" d2=\""+(i)+"\" d3=\""+(i)+"\" d4=\""+(i)+"\" d5=\""+(i)+"\" d6=\"0\" d7=\"0\" d8=\""+(i)+"\" d9=\""+(i)+"\" d10=\""+(i)+"\" d11=\""+(i)+"\" d12=\""+(i)+"\" d13=\"0\" d14=\"0\" d15=\""+(i)+"\" d16=\""+(i)+"\" d17=\""+(i)+"\" d18=\""+(i)+"\" d19=\""+(i)+"\" d20=\"0\" d21=\"0\" d22=\""+(i)+"\" d23=\""+(i)+"\" d24=\""+(i)+"\" d25=\""+(i)+"\" d26=\""+(i)+"\" d27=\"0\" d28=\"0\" d29=\""+(i)+"\" d30=\""+(i)+"\" d31=\""+(i)+"\" d32=\""+(i)+"\" d33=\""+(i)+"\" d34=\"0\" d35=\"0\" d36=\""+(i)+"\" d37=\""+(i)+"\" d38=\""+(i)+"\" d39=\""+(i)+"\" d40=\""+(i)+"\" d41=\"0\" d42=\"0\" d43=\""+(i)+"\" d44=\""+(i)+"\" d45=\""+(i)+"\" d46=\""+(i)+"\" d47=\""+(i)+"\" d48=\"0\" d49=\"0\" d50=\""+(i)+"\" d51=\""+(i)+"\" d52=\""+(i)+"\" d53=\""+(i)+"\" d54=\""+(i)+"\" d55=\"0\" d56=\"0\" d57=\""+(i)+"\" d58=\""+(i)+"\" d59=\""+(i)+"\" d60=\""+(i)+"\" d61=\""+(i)+"\" d62=\"0\" d63=\"0\" d64=\""+(i)+"\" d65=\""+(i)+"\" d66=\""+(i)+"\" d67=\""+(i)+"\" d68=\""+(i)+"\" d69=\"0\" d70=\"0\" d71=\""+(i)+"\" d72=\""+(i)+"\" d73=\""+(i)+"\" d74=\""+(i)+"\" d75=\""+(i)+"\" d76=\"0\" d77=\"0\" d78=\""+(i)+"\" d79=\""+(i)+"\" d80=\""+(i)+"\" d81=\""+(i)+"\" d82=\""+(i)+"\" d83=\"0\" d84=\"0\" d85=\""+(i)+"\" d86=\""+(i)+"\" d87=\""+(i)+"\" d88=\""+(i)+"\" d89=\""+(i)+"\" d90=\"0\" d91=\"0\" d92=\""+(i)+"\" d93=\""+(i)+"\" d94=\""+(i)+"\" d95=\""+(i)+"\" d96=\""+(i)+"\" d97=\"0\" d98=\"0\" d99=\""+(i)+"\" d100=\""+(i)+"\" d101=\""+(i)+"\" d102=\""+(i)+"\" d103=\""+(i)+"\" d104=\"0\" d105=\"0\" d106=\""+(i)+"\" d107=\""+(i)+"\" d108=\""+(i)+"\" d109=\""+(i)+"\" d110=\""+(i)+"\" d111=\"0\" d112=\"0\" d113=\""+(i)+"\" d114=\""+(i)+"\" d115=\""+(i)+"\" d116=\""+(i)+"\" d117=\""+(i)+"\" d118=\"0\" d119=\"0\" d120=\""+(i)+"\" d121=\""+(i)+"\" d122=\""+(i)+"\" d123=\""+(i)+"\" d124=\""+(i)+"\" d125=\"0\" d126=\"0\" d127=\""+(i)+"\" d128=\""+(i)+"\" d129=\""+(i)+"\" d130=\""+(i)+"\" d131=\""+(i)+"\" d132=\"0\" d133=\"0\" d134=\""+(i)+"\" d135=\""+(i)+"\" d136=\""+(i)+"\" d137=\""+(i)+"\" d138=\""+(i)+"\" d139=\"0\" d140=\"0\" d141=\""+(i)+"\" d142=\""+(i)+"\" d143=\""+(i)+"\" d144=\""+(i)+"\" d145=\""+(i)+"\" d146=\"0\" d147=\"0\" d148=\""+(i)+"\" d149=\""+(i)+"\" d150=\""+(i)+"\" d151=\""+(i)+"\" d152=\""+(i)+"\" d153=\"0\" d154=\"0\" d155=\""+(i)+"\" d156=\""+(i)+"\" d157=\""+(i)+"\" d158=\""+(i)+"\" d159=\""+(i)+"\" d160=\"0\" d161=\"0\" d162=\""+(i)+"\" d163=\""+(i)+"\" d164=\""+(i)+"\" d165=\""+(i)+"\" d166=\""+(i)+"\" d167=\"0\" d168=\"0\" d169=\""+(i)+"\" d170=\""+(i)+"\" d171=\""+(i)+"\" d172=\""+(i)+"\" d173=\""+(i)+"\" d174=\"0\" d175=\"0\" d176=\""+(i)+"\" d177=\""+(i)+"\" d178=\""+(i)+"\" d179=\""+(i)+"\" d180=\""+(i)+"\" d181=\"0\" d182=\"0\" d183=\""+(i)+"\" d184=\""+(i)+"\" d185=\""+(i)+"\" d186=\""+(i)+"\" d187=\""+(i)+"\" d188=\"0\" d189=\"0\" d190=\""+(i)+"\" d191=\""+(i)+"\" d192=\""+(i)+"\" d193=\""+(i)+"\" d194=\""+(i)+"\" d195=\"0\" d196=\"0\" d197=\""+(i)+"\" d198=\""+(i)+"\" d199=\""+(i)+"\" d200=\""+(i)+"\" d201=\""+(i)+"\" d202=\"0\" d203=\"0\" d204=\""+(i)+"\" d205=\""+(i)+"\" d206=\""+(i)+"\" d207=\""+(i)+"\" d208=\""+(i)+"\" d209=\"0\" d210=\"0\" d211=\""+(i)+"\" d212=\""+(i)+"\" d213=\""+(i)+"\" d214=\""+(i)+"\" d215=\""+(i)+"\" d216=\"0\" d217=\"0\" d218=\""+(i)+"\" d219=\""+(i)+"\" d220=\""+(i)+"\" d221=\""+(i)+"\" d222=\""+(i)+"\" d223=\"0\" d224=\"0\" d225=\""+(i)+"\" d226=\""+(i)+"\" d227=\""+(i)+"\" d228=\""+(i)+"\" d229=\""+(i)+"\" d230=\"0\" d231=\"0\" d232=\""+(i)+"\" d233=\""+(i)+"\" d234=\""+(i)+"\" d235=\""+(i)+"\" d236=\""+(i)+"\" d237=\"0\" d238=\"0\" d239=\""+(i)+"\" d240=\""+(i)+"\" d241=\""+(i)+"\" d242=\""+(i)+"\" d243=\""+(i)+"\" d244=\"0\" d245=\"0\" d246=\""+(i)+"\" d247=\""+(i)+"\" d248=\""+(i)+"\" d249=\""+(i)+"\" d250=\""+(i)+"\" d251=\"0\" d252=\"0\" d253=\""+(i)+"\" d254=\""+(i)+"\" d255=\""+(i)+"\" d256=\""+(i)+"\" d257=\""+(i)+"\" d258=\"0\" d259=\"0\" d260=\""+(i)+"\" d261=\""+(i)+"\" d262=\""+(i)+"\" d263=\""+(i)+"\" d264=\""+(i)+"\" d265=\""+(i)+"\" d266=\"0\" d267=\"0\" d268=\""+(i)+"\" d269=\""+(i)+"\" d270=\""+(i)+"\" d271=\""+(i)+"\" d272=\""+(i)+"\" d273=\"0\" d274=\"0\" d275=\""+(i)+"\" d276=\""+(i)+"\" d277=\""+(i)+"\" d278=\""+(i)+"\" d279=\""+(i)+"\" d280=\"0\" d281=\"0\" d282=\""+(i)+"\" d283=\""+(i)+"\" d284=\""+(i)+"\" d285=\""+(i)+"\" d286=\""+(i)+"\" d287=\"0\" d288=\"0\" d289=\""+(i)+"\" d290=\""+(i)+"\" d291=\""+(i)+"\" d292=\""+(i)+"\" d293=\""+(i)+"\" d294=\"0\" d295=\"0\" d296=\""+(i)+"\" d297=\""+(i)+"\" d298=\""+(i)+"\" d299=\""+(i)+"\" d300=\""+(i)+"\" d301=\"0\" d302=\"0\" d303=\""+(i)+"\" d304=\""+(i)+"\" d305=\""+(i)+"\" d306=\""+(i)+"\" d307=\""+(i)+"\" d308=\"0\" d309=\"0\" d310=\""+(i)+"\" d311=\""+(i)+"\" d312=\""+(i)+"\" d313=\""+(i)+"\" d314=\""+(i)+"\" d315=\"0\" d316=\"0\" d317=\""+(i)+"\" d318=\""+(i)+"\" d319=\""+(i)+"\" d320=\""+(i)+"\" d321=\""+(i)+"\" d322=\"0\" d323=\"0\" d324=\""+(i)+"\" d325=\""+(i)+"\" d326=\""+(i)+"\" d327=\""+(i)+"\" d328=\""+(i)+"\" d329=\"0\" d330=\"0\" d331=\""+(i)+"\" d332=\""+(i)+"\" d333=\""+(i)+"\" d334=\""+(i)+"\" d335=\""+(i)+"\" d336=\"0\" d337=\"0\" d338=\""+(i)+"\" d339=\""+(i)+"\" d340=\""+(i)+"\" d341=\""+(i)+"\" d342=\""+(i)+"\" d343=\"0\" d344=\"0\" d345=\""+(i)+"\" d346=\""+(i)+"\" d347=\""+(i)+"\" d348=\""+(i)+"\" d349=\""+(i)+"\" d350=\"0\" d351=\"0\" d352=\""+(i)+"\" d353=\""+(i)+"\" d354=\""+(i)+"\" d355=\""+(i)+"\" d356=\""+(i)+"\" d357=\"0\" d358=\"0\" d359=\""+(i)+"\" d360=\""+(i)+"\" d361=\""+(i)+"\" d362=\""+(i)+"\" d363=\""+(i)+"\" d364=\"0\" d365=\"0\"/> \n");
						}else{
							fw.write("<OccupancyYearProfile id=\""+(i)+"\" d1=\""+(i)+"\" d2=\""+(i)+"\" d3=\""+(i)+"\" d4=\""+(i)+"\" d5=\""+(i)+"\" d6=\""+(i)+"\" d7=\""+(i)+"\" d8=\""+(i)+"\" d9=\""+(i)+"\" d10=\""+(i)+"\" d11=\""+(i)+"\" d12=\""+(i)+"\" d13=\""+(i)+"\" d14=\""+(i)+"\" d15=\""+(i)+"\" d16=\""+(i)+"\" d17=\""+(i)+"\" d18=\""+(i)+"\" d19=\""+(i)+"\" d20=\""+(i)+"\" d21=\""+(i)+"\" d22=\""+(i)+"\" d23=\""+(i)+"\" d24=\""+(i)+"\" d25=\""+(i)+"\" d26=\""+(i)+"\" d27=\""+(i)+"\" d28=\""+(i)+"\" d29=\""+(i)+"\" d30=\""+(i)+"\" d31=\""+(i)+"\" d32=\""+(i)+"\" d33=\""+(i)+"\" d34=\""+(i)+"\" d35=\""+(i)+"\" d36=\""+(i)+"\" d37=\""+(i)+"\" d38=\""+(i)+"\" d39=\""+(i)+"\" d40=\""+(i)+"\" d41=\""+(i)+"\" d42=\""+(i)+"\" d43=\""+(i)+"\" d44=\""+(i)+"\" d45=\""+(i)+"\" d46=\""+(i)+"\" d47=\""+(i)+"\" d48=\""+(i)+"\" d49=\""+(i)+"\" d50=\""+(i)+"\" d51=\""+(i)+"\" d52=\""+(i)+"\" d53=\""+(i)+"\" d54=\""+(i)+"\" d55=\""+(i)+"\" d56=\""+(i)+"\" d57=\""+(i)+"\" d58=\""+(i)+"\" d59=\""+(i)+"\" d60=\""+(i)+"\" d61=\""+(i)+"\" d62=\""+(i)+"\" d63=\""+(i)+"\" d64=\""+(i)+"\" d65=\""+(i)+"\" d66=\""+(i)+"\" d67=\""+(i)+"\" d68=\""+(i)+"\" d69=\""+(i)+"\" d70=\""+(i)+"\" d71=\""+(i)+"\" d72=\""+(i)+"\" d73=\""+(i)+"\" d74=\""+(i)+"\" d75=\""+(i)+"\" d76=\""+(i)+"\" d77=\""+(i)+"\" d78=\""+(i)+"\" d79=\""+(i)+"\" d80=\""+(i)+"\" d81=\""+(i)+"\" d82=\""+(i)+"\" d83=\""+(i)+"\" d84=\""+(i)+"\" d85=\""+(i)+"\" d86=\""+(i)+"\" d87=\""+(i)+"\" d88=\""+(i)+"\" d89=\""+(i)+"\" d90=\""+(i)+"\" d91=\""+(i)+"\" d92=\""+(i)+"\" d93=\""+(i)+"\" d94=\""+(i)+"\" d95=\""+(i)+"\" d96=\""+(i)+"\" d97=\""+(i)+"\" d98=\""+(i)+"\" d99=\""+(i)+"\" d100=\""+(i)+"\" d101=\""+(i)+"\" d102=\""+(i)+"\" d103=\""+(i)+"\" d104=\""+(i)+"\" d105=\""+(i)+"\" d106=\""+(i)+"\" d107=\""+(i)+"\" d108=\""+(i)+"\" d109=\""+(i)+"\" d110=\""+(i)+"\" d111=\""+(i)+"\" d112=\""+(i)+"\" d113=\""+(i)+"\" d114=\""+(i)+"\" d115=\""+(i)+"\" d116=\""+(i)+"\" d117=\""+(i)+"\" d118=\""+(i)+"\" d119=\""+(i)+"\" d120=\""+(i)+"\" d121=\""+(i)+"\" d122=\""+(i)+"\" d123=\""+(i)+"\" d124=\""+(i)+"\" d125=\""+(i)+"\" d126=\""+(i)+"\" d127=\""+(i)+"\" d128=\""+(i)+"\" d129=\""+(i)+"\" d130=\""+(i)+"\" d131=\""+(i)+"\" d132=\""+(i)+"\" d133=\""+(i)+"\" d134=\""+(i)+"\" d135=\""+(i)+"\" d136=\""+(i)+"\" d137=\""+(i)+"\" d138=\""+(i)+"\" d139=\""+(i)+"\" d140=\""+(i)+"\" d141=\""+(i)+"\" d142=\""+(i)+"\" d143=\""+(i)+"\" d144=\""+(i)+"\" d145=\""+(i)+"\" d146=\""+(i)+"\" d147=\""+(i)+"\" d148=\""+(i)+"\" d149=\""+(i)+"\" d150=\""+(i)+"\" d151=\""+(i)+"\" d152=\""+(i)+"\" d153=\""+(i)+"\" d154=\""+(i)+"\" d155=\""+(i)+"\" d156=\""+(i)+"\" d157=\""+(i)+"\" d158=\""+(i)+"\" d159=\""+(i)+"\" d160=\""+(i)+"\" d161=\""+(i)+"\" d162=\""+(i)+"\" d163=\""+(i)+"\" d164=\""+(i)+"\" d165=\""+(i)+"\" d166=\""+(i)+"\" d167=\""+(i)+"\" d168=\""+(i)+"\" d169=\""+(i)+"\" d170=\""+(i)+"\" d171=\""+(i)+"\" d172=\""+(i)+"\" d173=\""+(i)+"\" d174=\""+(i)+"\" d175=\""+(i)+"\" d176=\""+(i)+"\" d177=\""+(i)+"\" d178=\""+(i)+"\" d179=\""+(i)+"\" d180=\""+(i)+"\" d181=\""+(i)+"\" d182=\""+(i)+"\" d183=\""+(i)+"\" d184=\""+(i)+"\" d185=\""+(i)+"\" d186=\""+(i)+"\" d187=\""+(i)+"\" d188=\""+(i)+"\" d189=\""+(i)+"\" d190=\""+(i)+"\" d191=\""+(i)+"\" d192=\""+(i)+"\" d193=\""+(i)+"\" d194=\""+(i)+"\" d195=\""+(i)+"\" d196=\""+(i)+"\" d197=\""+(i)+"\" d198=\""+(i)+"\" d199=\""+(i)+"\" d200=\""+(i)+"\" d201=\""+(i)+"\" d202=\""+(i)+"\" d203=\""+(i)+"\" d204=\""+(i)+"\" d205=\""+(i)+"\" d206=\""+(i)+"\" d207=\""+(i)+"\" d208=\""+(i)+"\" d209=\""+(i)+"\" d210=\""+(i)+"\" d211=\""+(i)+"\" d212=\""+(i)+"\" d213=\""+(i)+"\" d214=\""+(i)+"\" d215=\""+(i)+"\" d216=\""+(i)+"\" d217=\""+(i)+"\" d218=\""+(i)+"\" d219=\""+(i)+"\" d220=\""+(i)+"\" d221=\""+(i)+"\" d222=\""+(i)+"\" d223=\""+(i)+"\" d224=\""+(i)+"\" d225=\""+(i)+"\" d226=\""+(i)+"\" d227=\""+(i)+"\" d228=\""+(i)+"\" d229=\""+(i)+"\" d230=\""+(i)+"\" d231=\""+(i)+"\" d232=\""+(i)+"\" d233=\""+(i)+"\" d234=\""+(i)+"\" d235=\""+(i)+"\" d236=\""+(i)+"\" d237=\""+(i)+"\" d238=\""+(i)+"\" d239=\""+(i)+"\" d240=\""+(i)+"\" d241=\""+(i)+"\" d242=\""+(i)+"\" d243=\""+(i)+"\" d244=\""+(i)+"\" d245=\""+(i)+"\" d246=\""+(i)+"\" d247=\""+(i)+"\" d248=\""+(i)+"\" d249=\""+(i)+"\" d250=\""+(i)+"\" d251=\""+(i)+"\" d252=\""+(i)+"\" d253=\""+(i)+"\" d254=\""+(i)+"\" d255=\""+(i)+"\" d256=\""+(i)+"\" d257=\""+(i)+"\" d258=\""+(i)+"\" d259=\""+(i)+"\" d260=\""+(i)+"\" d261=\""+(i)+"\" d262=\""+(i)+"\" d263=\""+(i)+"\" d264=\""+(i)+"\" d265=\""+(i)+"\" d266=\""+(i)+"\" d267=\""+(i)+"\" d268=\""+(i)+"\" d269=\""+(i)+"\" d270=\""+(i)+"\" d271=\""+(i)+"\" d272=\""+(i)+"\" d273=\""+(i)+"\" d274=\""+(i)+"\" d275=\""+(i)+"\" d276=\""+(i)+"\" d277=\""+(i)+"\" d278=\""+(i)+"\" d279=\""+(i)+"\" d280=\""+(i)+"\" d281=\""+(i)+"\" d282=\""+(i)+"\" d283=\""+(i)+"\" d284=\""+(i)+"\" d285=\""+(i)+"\" d286=\""+(i)+"\" d287=\""+(i)+"\" d288=\""+(i)+"\" d289=\""+(i)+"\" d290=\""+(i)+"\" d291=\""+(i)+"\" d292=\""+(i)+"\" d293=\""+(i)+"\" d294=\""+(i)+"\" d295=\""+(i)+"\" d296=\""+(i)+"\" d297=\""+(i)+"\" d298=\""+(i)+"\" d299=\""+(i)+"\" d300=\""+(i)+"\" d301=\""+(i)+"\" d302=\""+(i)+"\" d303=\""+(i)+"\" d304=\""+(i)+"\" d305=\""+(i)+"\" d306=\""+(i)+"\" d307=\""+(i)+"\" d308=\""+(i)+"\" d309=\""+(i)+"\" d310=\""+(i)+"\" d311=\""+(i)+"\" d312=\""+(i)+"\" d313=\""+(i)+"\" d314=\""+(i)+"\" d315=\""+(i)+"\" d316=\""+(i)+"\" d317=\""+(i)+"\" d318=\""+(i)+"\" d319=\""+(i)+"\" d320=\""+(i)+"\" d321=\""+(i)+"\" d322=\""+(i)+"\" d323=\""+(i)+"\" d324=\""+(i)+"\" d325=\""+(i)+"\" d326=\""+(i)+"\" d327=\""+(i)+"\" d328=\""+(i)+"\" d329=\""+(i)+"\" d330=\""+(i)+"\" d331=\""+(i)+"\" d332=\""+(i)+"\" d333=\""+(i)+"\" d334=\""+(i)+"\" d335=\""+(i)+"\" d336=\""+(i)+"\" d337=\""+(i)+"\" d338=\""+(i)+"\" d339=\""+(i)+"\" d340=\""+(i)+"\" d341=\""+(i)+"\" d342=\""+(i)+"\" d343=\""+(i)+"\" d344=\""+(i)+"\" d345=\""+(i)+"\" d346=\""+(i)+"\" d347=\""+(i)+"\" d348=\""+(i)+"\" d349=\""+(i)+"\" d350=\""+(i)+"\" d351=\""+(i)+"\" d352=\""+(i)+"\" d353=\""+(i)+"\" d354=\""+(i)+"\" d355=\""+(i)+"\" d356=\""+(i)+"\" d357=\""+(i)+"\" d358=\""+(i)+"\" d359=\""+(i)+"\" d360=\""+(i)+"\" d361=\""+(i)+"\" d362=\""+(i)+"\" d363=\""+(i)+"\" d364=\""+(i)+"\" d365=\""+(i)+"\"/> \n");
						}
					}

					// unique surface index for the XML file
					int surfaceIndex = 1;
					//boolean floorsPresence = false;
					boolean solarPV = false;
					int zone = 9;
					int scenario = 0;
					int generate_id = 1;
					int zone_id = 1;
					//locate the following gid
					//int gidValue = 144639;
					//Let's try to make a query
					myQuery = "SELECT * FROM data.building ORDER BY egid";  //DONNÉES COMPLÈTES
					//myQuery = "SELECT * FROM data.building WHERE egid IN (1013122, 1013123, 1013124, 1013125, 1013126, 1013127, 1013128, 1013130, 1013131, 1013132, 1013133, 1013134, 1013135, 1013136, 1013137, 1013138, 1013139, 1013140, 1013141, 1013142, 1013143, 1013144, 1013145, 2038842, 2038845, 295113055, 295111490, 295094636, 2039329) ORDER BY egid ";
					//			WHERE building_id_fk = " + gidValue;
					st = c.createStatement();
					rs = st.executeQuery(myQuery);
					double residentialOcc=0, otherOcc=0;
					while (rs.next()) {
						String building_id   = rs.getString("building_id_fk");
						String egid  		 = rs.getString("egid");
						double volume		 = rs.getDouble("volume");
						double height        = rs.getDouble("height");
						double glazingRatio  = 0.175;
						double infiltrationRate = rs.getDouble("infiltration_rate")*natVentilationCoeff[rs.getInt("occupancytype")-1];
						double ventilation = 0.6;
						double ventilationRate = 0.6;
						if(rs.getInt("gbauj") >= 2000){
							glazingRatio  = 0.245;
						}
						// use the boolean value to determine if needed to cut the building or not
						int nfloors = 1;
						//if (floorsPresence) nfloors = rs.getInt("n_floors");
						System.out.println("EGID:" + egid);
						System.out.println("Building ID: " + building_id);
						System.out.println("Height: " + height);
						System.out.println("Volume: " + volume);

						String myQueryVentilation = "SELECT ventilation_rate FROM data.occupancy_type WHERE occupancy_type_id = "+rs.getInt("occupancytype")+"";
						Statement stVent = c.createStatement();
						ResultSet rsVent = stVent.executeQuery(myQueryVentilation);
						rsVent.next();
						ventilationRate = rsVent.getDouble("ventilation_rate")*ventilationCoeff[rs.getInt("occupancytype")-1]*rs.getInt("n_floors")/rs.getDouble("height");

						if(infiltrationRate <= ventilationRate){
							ventilation = ventilationRate;
						}else{
							ventilation = infiltrationRate;
						}
						//These values for vol, loss, and power are modified by the MATLAB code depending on the water deposit that the building needs
						double vol = 50;
						double loss = 200;
						double power = 10000000;
						fw.write("<Building id=\""+building_id+"\" key=\""+egid+"\" Vi=\"" + volume + "\" Ninf=\""+ ventilation + "\" Tmin=\"21.0\" Tmax=\"26.0\" BlindsLambda=\""+ rs.getDouble("blindslambda") + "\" BlindsIrradianceCutOff=\""+ rs.getDouble("blindsirradiancecutoff") + "\" Simulate=\"true\">\n");
						fw.write("<HeatTank V=\""+vol+"\" phi=\""+loss+"\" rho=\"1000.0\" Cp=\"4180.0\" Tmin=\"20.0\" Tmax=\"35.0\" Tcritical=\"90.0\"/>\n");
						fw.write("<DHWTank V=\"0.2\" phi=\"2.5\" rho=\"1000.0\" Cp=\"4180.0\" Tmin=\"50.0\" Tmax=\"70.0\" Tcritical=\"90.0\" Tinlet=\"5.0\"/>\n");
						fw.write("<CoolTank V=\"20.0\" phi=\"20.0\" rho=\"1000.0\" Cp=\"4180.0\" Tmin=\"5.0\" Tmax=\"20.0\"/>\n");
						fw.write("<HeatSource beginDay=\"288\" endDay=\"135\">\n");  //Heating starting when Ta<18C(06-Sept) and shutting down when Ta>18C(06-Jun)
						//fw.write("<HeatPump Pmax=\""+power+"\" Tsource=\"2\" Ttarget=\"35\" eta_tech=\"0.47\" position=\"vertical\"/>\n");
						fw.write("<Boiler name = \"boiler1\" Pmax=\"500000\" eta_th=\"0.96\"/>\n");
						fw.write("</HeatSource>\n");
						//fw.write("<CoolSource beginDay=\"364\" endDay=\"365\">\n"); //To be set
						//fw.write("<HeatPump Pmax=\""+power+"\" Tsource=\"35\" Ttarget=\"7\" eta_tech=\"0.297\" position=\"vertical\"/>\n");
						//fw.write("</CoolSource>\n");
						fw.flush();
						// locates difference between buildings

						String myQueryOccupants = "SELECT surface_personne FROM data.occupancy_type WHERE occupancy_type_id = "+rs.getInt("occupancytype")+"";
						Statement stOccupants = c.createStatement();
						ResultSet rsOccupants = stOccupants.executeQuery(myQueryOccupants);
						rsOccupants.next();

						boolean gFloor = true;
						double occupants = 0;
						if(rs.getInt("nopeople")== 0 || Math.abs(rs.getDouble("floor_area")*0.8/rsOccupants.getDouble("surface_personne")-rs.getInt("nopeople")/rs.getDouble("n_floors"))/(rs.getDouble("floor_area")*0.8/rsOccupants.getDouble("surface_personne"))>0.5){
							occupants = peopleCoeff[rs.getInt("occupancytype")-1]*0.76*rs.getDouble("floor_area")*rs.getInt("n_floors")*0.8/rsOccupants.getDouble("surface_personne");
						}else{
							occupants = peopleCoeff[rs.getInt("occupancytype")-1]*0.76*(rs.getDouble("floor_area")*rs.getInt("n_floors")*0.8/rsOccupants.getDouble("surface_personne")+rs.getInt("nopeople"))/2.0;
						}

						fw.write("<Zone id=\"" + (zone_id++) + "\" volume =\"" + volume*0.8 + "\" Psi=\"0.2\" groundFloor=\"" + gFloor + "\">\n");

						if(rs.getInt("occupancytype") == 1){
							fw.write("<Occupants n=\"" + occupants + "\" type =\"" +rs.getInt("occupancytype")+ "\" Stochastic=\"true\" activityType=\"11\" DHWType=\"1\"/>\n");
							residentialOcc+=occupants;
						}else{
							fw.write("<Occupants n=\"" + occupants + "\" type =\"" +rs.getInt("occupancytype")+ "\" Stochastic=\"true\" activityType=\"11\" DHWType=\"2\"/>\n");
							otherOcc+=occupants;
						}

						String myQuery2 = "SELECT geometry FROM data.enveloppe WHERE egid="+Double.parseDouble(egid)+" AND class_id=34";
						//System.out.println(myQuery2);
						// ST_GeometryN decomposes the geometry in elements (MULTIPOLYGON -> POLYGON)
						Statement st2 = c.createStatement();
						ResultSet rs2 = st2.executeQuery(myQuery2);
						while (rs2.next()) {
							PGgeometry geom_wall;
							geom_wall=(PGgeometry)rs2.getObject("geometry");
							Polygon pl_wall = (Polygon)geom_wall.getGeometry();
							//System.out.println("Class:" + class_id + "	" + pl_wall);
							fw.write("<Wall id=\"" + (generate_id++) + "\" type=\"" + rs.getString("composite_id_fk") + "\" ShortWaveReflectance=\"" + rs.getDouble("wall_shortwave_reflectance") + "\"  GlazingRatio=\"" + glazingRatio + "\"  GlazingGValue=\"" + rs.getDouble("window_g_value") + "\" GlazingUValue=\"" + rs.getDouble("window_u_value")*1.43 + "\" OpenableRatio=\"0.5\">\n");
							int WallNumber = 0;
							
							for (int WallIndex = pl_wall.numPoints()-1; WallIndex >= 0; WallIndex--) {
								Point pt = pl_wall.getPoint(WallIndex);
								//Les coorodonnées sont recalculées à partir de la station météo de Cointrin (498905, 122632, 412 en MN03 (CH1903) et 2498904.449, 1122632.209 en CH1903+)
								Double X=pt.getX()-2000000;
								Double Y=pt.getY()-1000000;
								Double Z=pt.getZ();
								//System.out.println("X" + " | " + X);
								fw.write("<V" + WallNumber + " x=\"" + X +"\" y=\"" + Y + "\" z=\"" + Z + "\"/>\n");
								WallNumber++;
							}
							fw.write("</Wall>\n");
						}


						String myQuery4 = "SELECT geometry FROM data.enveloppe WHERE egid="+Double.parseDouble(egid)+" AND class_id=33";
						//System.out.println(myQuery4);
						// ST_GeometryN decomposes the geometry in elements (MULTIPOLYGON -> POLYGON)
						Statement st4 = c.createStatement();
						ResultSet rs4 = st4.executeQuery(myQuery4);
						while (rs4.next()) {
							PGgeometry geom_roof;
							geom_roof=(PGgeometry)rs4.getObject("geometry");
							Polygon pl_roof = (Polygon)geom_roof.getGeometry();
							
							LinearRing rng = pl_roof.getRing(0); 
						    if (rng != null){
						
						    	fw.write("<Roof id=\"" + (surfaceIndex++) + "\" type=\"87\" ShortWaveReflectance=\"0.2\" GlazingRatio=\"0.0\" GlazingGValue=\"0.7\" GlazingUValue=\"1.4\" OpenableRatio=\"0.0\">\n");								
						
						    	int RoofNumber = 0;
													
						    	for (int RoofIndex = rng.numPoints()-1; RoofIndex >= 0 ; RoofIndex--) {
						    		Point pt = pl_roof.getPoint(RoofIndex);  
									//System.out.println(pt);
									Double X=pt.getX()-2000000;
									Double Y=pt.getY()-1000000;
									Double Z=pt.getZ();
									//System.out.println(X);
									fw.write("<V" + RoofNumber + " x=\"" + X +"\" y=\"" + Y + "\" z=\"" + Z + "\"/>\n");
									RoofNumber++;
								}
							fw.write("</Roof>\n");
						    }
						}

						String myQuery3 = "SELECT geometry FROM data.enveloppe WHERE egid="+Double.parseDouble(egid)+" AND class_id=35";
						//System.out.println(myQuery3);
						// ST_GeometryN decomposes the geometry in elements (MULTIPOLYGON -> POLYGON)
						Statement st3 = c.createStatement();
						ResultSet rs3 = st3.executeQuery(myQuery3);
						while (rs3.next()) {
							PGgeometry geom_floor;
							geom_floor=(PGgeometry)rs3.getObject("geometry");
							Polygon pl_floor = (Polygon)geom_floor.getGeometry();
							//System.out.println("Class:" + class_id + "	" + pl_floor);

							fw.write("<Floor id=\"" + (generate_id++) + "\" type=\"65\">\n");
							int FloorNumber = 0;
							
							for (int FloorIndex = pl_floor.numPoints()-1; FloorIndex >= 0; FloorIndex--) {
								Point pt = pl_floor.getPoint(FloorIndex);
								Double X=pt.getX()-2000000;
								Double Y=pt.getY()-1000000;
								Double Z=pt.getZ();
								//System.out.println(FloorIndex + " | " + pt);
								fw.write("<V" + FloorNumber + " x=\"" + X +"\" y=\"" + Y + "\" z=\"" + Z + "\"/>\n");
								FloorNumber++;
							}
							fw.write("</Floor>\n");
						}
						fw.write("</Zone>\n");
						// ends the tag Building
						fw.write("</Building>\n");
					}
					rs.close();
					st.close();
					
					/*PGgeometry geom_ground;
					//WRITING THE SURROUNDING BUILDINGS AS SURFACES (they are just defined as surfaces to reduce computational load)

					myQuery = "SELECT * FROM data.ground WHERE zone = " + zone + "";
					System.out.println(myQuery);
					st = c.createStatement();
					rs = st.executeQuery(myQuery);
					fw.write("<GroundSurface>\n");
					while (rs.next()){ //DEFINING THE GROUND SURFACES
						double groundAltitude = rs.getDouble("altitude");
						String myQuery2 = "SELECT * FROM data.citysim_get_ground2("+ rs.getInt("ground_id_fk") + ")";
						System.out.println(myQuery2);
						Statement st2 = c.createStatement();
						ResultSet rs2 = st2.executeQuery(myQuery2);
						while (rs2.next()) {
							geom_ground = (PGgeometry)rs2.getObject("ml_footprint");
							MultiLineString mls_ground = (MultiLineString)geom_ground.getGeometry();
							System.out.println("mls_ground: " + mls_ground.toString());
							for (int lsgroundIndex = 0; lsgroundIndex < mls_ground.numLines(); lsgroundIndex++) {
								LineString ls_ground = mls_ground.getLine(lsgroundIndex);
								//System.out.println(ls_ground);
								fw.write("<Ground id=\"" + (generate_id++) + "\" ShortWaveReflectance=\"" + rs.getString("ground_shortwave_reflectance") + "\" type=\"" + rs.getInt("composite_id_fk")+"\">\n");
								for( int p = ls_ground.numPoints()-2; p >= 0; p-- ) {
									Point pt = ls_ground.getPoint(p);
									//System.out.println(pt);
									fw.write("<V" + ((ls_ground.numPoints()-2)-p) + " x=\"" + pt.getX() + "\" y=\"" + pt.getY() + "\" z=\"" + groundAltitude + "\"/>\n");
								}
								fw.write("</Ground>\n");
							}
						}
					}
					fw.write("</GroundSurface>\n");*/
					// writes the end of the XML file and closes the filewriter
					fw.write("</District>\n");
					fw.write("</CitySim>\n");
					System.out.println("Residential occupants: " +residentialOcc);
					System.out.println("Other occupants: " +otherOcc);
					fw.close();
				}
				catch (ClassNotFoundException cnfe)
				{
					System.out.println("Couldn't find org.postgis.PGgeometry");
					cnfe.printStackTrace();
					System.exit(1);
				}
				catch (SQLException se)
				{
					System.out.println("Couldn't connect: print out a stack trace and exit.");
					se.printStackTrace();
					System.exit(1);
				}
				catch (IOException ie)
				{
					System.out.println("Error writing the XML file.");
					ie.printStackTrace();
					System.exit(1);
				}
			}
			else
				System.out.println("We should never get here.");
		}
}
