import java.awt.*;
import java.Swing.*;
import java.awt.Event.*;
import java.io.*;
import java.net.*;

public class JIM extends Frame {

		Label nicknamelabel;
		TextField nickname;

		Label addresslabel;
		TextField ipaddress;

		Label portlabel;
		TextField portnum;

		Button connect;

		Panel panel1;

		Panel panel2;

		Label portlabel2;
		TextField portnum2;

		Button create;

	public JIM() {


		super("Java IM");
        setSize(600,600);
        setLayout(new BorderLayout());

		panel1 = new Panel(new GridLayout(5,1));

		addresslabel = new Label("IP Address ");
		panel1.add(addresslabel);

		ipaddress = new TextField();
		panel1.add(ipaddress);

		portlabel = new Label("Port ");
		panel1.add(portlabel);

		portnum = new TextField();
		panel1.add(portnum);

		connect = new Button("Connect");
		panel1.add(connect);

		add(panel1,NORTH);

		panel2 = new Panel(new GridLayout(3,1));

		portlabel2 = new Label("Port ");
		panel2.add(portlabel2);

		portnum2 = new TextField();
		panel2.add(portnum2);

		create = new Button("Create");
		panel2.add(create);

		add(panel2,CENTER);

		connect.addActionListener(this);
		create.addActionListener(this);

	}

	public void ActionPerformed(Event e) {

		if(e.Source() == connect)
			connect(ipaddress,portnum);

		if(e.Source() == create)
			create(portnum2);

	}

	public void create(int port) {

		ServerSocket connection(port);

	}

	public void connect(String address, int port){

		Socket connection(address,port);

	}

	public void chat(Socket connection, String name1,name2) {

		Frame chatbox = new Frame();
		chatbox.setLayout(new BorderLayout());
		Label text = new Label();
		TextField textsend = new TextField();
		Button send = new Button("Send");

		chatbox.add(text,CENTER);
		chatbox.add(textsend,SOUTH);
		chatbox.add(send,SOUTH);

		send.addActionListener(this);
		textsend.addActionListener(this);

		public void ActionPerformed(Event e) {

			text.setText(name1 + ": " + textsend);
			connection

		}

	}

	public static void main(String args[]){
      
      JIM instance = new JIM();
      
   }
	

}