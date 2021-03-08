import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JLabel;

import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class FPU_Main
{
	public static void main(String[] args)
	{
		UPW obj = new UPW();	
	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class UPW
{
	private static int Attempt = 3;

	public UPW()
	{
		JFrame f = new JFrame("Packer-Unpacker Login");

		JLabel lobj1 = new JLabel("Username: ");
		lobj1.setBounds(100,20,200,190);

		JTextField tf1 = new JTextField();
		tf1.setBounds(200,100,150,30);



		JPasswordField value = new JPasswordField();
		value.setBounds(200,200,150,30);


		JLabel lobj = new JLabel("Password:");
		lobj.setBounds(100,20,400,390);

		JButton bobj = new JButton("Submit");
		bobj.setBounds(350,300,100,40);
		
		 f.add(bobj);
		 f.add(lobj1);
		 f.add(tf1);
		
		f.add(value);
		f.add(lobj);

		f.setSize(600,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){
				
				UPValidation(tf1.getText(),value.getText());
				f.setVisible(false);
				
		
			}
		});

	}

	public void UPValidation(String UN,String PW)
	{
			String Username = "Shubham";
			String Password = "Nimase";

		if ((UN.equals(Username)) && (PW.equals(Password)))
		{
			ChooseW cw = new ChooseW();
		}
		else
		{
			Attempt--;

			System.out.println("Invalid Creditionals !!!");
			
			Warning1 w1 = new Warning1();

		}


	}
}



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class ChooseW
{
	public ChooseW()
	{
		JFrame f = new JFrame("Packer-Unpacker Oprations");
		
		JButton bobj1 = new JButton("Pack");
		bobj1.setBounds(150,100,100,40);

		JButton bobj2 = new JButton("Unpack");
		bobj2.setBounds(350,100,100,40);


		JButton bobj3 = new JButton("Exit Process");
		bobj3.setBounds(220,210,150,40);


		 f.add(bobj1);
		 f.add(bobj2);
		 f.add(bobj3);
		 
		f.setSize(600,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){
				
				Window o = new Window();
				f.setVisible(false);

			}
		});



		bobj2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){
				
				Window2 o2 = new Window2();
				f.setVisible(false);

			}
		});



		bobj3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){
				
				f.setVisible(false);
				System.exit(0);

			}
		});

	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Warning1
{
	private static int i = 2; 

	public Warning1()
	{

		if (i == 0)
		{
				Warning2 w2 = new Warning2();
			
		}

		JFrame f = new JFrame("Security Warning");
		
		JLabel lobj1 = new JLabel("Sorry !! that didn't work");
		lobj1.setBounds(140,2,200,100);
		
		JLabel lobj2 = new JLabel("Please try again.");
		lobj2.setBounds(165,22,200,100);

		JLabel lobj3 = new JLabel("Only "+i+" attempt(s) left !!");
		lobj3.setBounds(140,70,200,100);

		i--;

		JButton bobj1 = new JButton("OK");
		bobj1.setBounds(190,150,70,40);

		
		 f.add(bobj1);
		 f.add(lobj1);
		 f.add(lobj2);
		 f.add(lobj3);

		f.setSize(450,250);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){

				UPW obj1 = new UPW();
				f.setVisible(false);

			}
		});

	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Window
{
	public Window()
	{
		JFrame f = new JFrame("Packer-Unpacker Packing Portal");
		
		JButton bobj1 = new JButton("Submit");
		bobj1.setBounds(350,300,100,40);

		JButton bobj2 = new JButton("Previous");
		bobj2.setBounds(600,300,100,40);


		JLabel lobj1 = new JLabel("Enter Directory Name :");
		lobj1.setBounds(350,20,200,200);

		JTextField tf1 = new JTextField();
		tf1.setBounds(550,110,150,30);


		JLabel lobj2 = new JLabel("Enter New File Name :");
		lobj2.setBounds(350,20,400,350);

		JTextField tf2 = new JTextField();
		tf2.setBounds(550,180,150,30);
		
		 f.add(bobj1);
		 f.add(bobj2);
		 f.add(lobj1);
		 f.add(tf1);

		f.add(lobj2);
		f.add(tf2);

		f.setSize(1000,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){
				
				Packer pobj = new Packer(tf1.getText(),tf2.getText());
				f.setVisible(false);
			}
		});



		bobj2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){
				
				ChooseW cw = new ChooseW();			
				f.setVisible(false);

			}
		});

	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Window2
{
	public Window2()
	{
		JFrame f = new JFrame("Packer-Unpacker Unpacking Portal");
		
		JButton bobj1 = new JButton("Extract here");
		bobj1.setBounds(300,300,150,40);

		JButton bobj2 = new JButton("Previous");
		bobj2.setBounds(600,300,100,40);

		JLabel lobj = new JLabel("Enter File Name : ");
		lobj.setBounds(350,20,200,290);

		JTextField tf = new JTextField();
		tf.setBounds(500,150,150,30);


		 f.add(bobj1);
		 f.add(bobj2);
		 f.add(lobj);
		 f.add(tf);

		f.setSize(1000,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){
				
				Unpacker upobj = new Unpacker(tf.getText());
				f.setVisible(false);

			}
		});


		bobj2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){
				
				ChooseW cw = new ChooseW();			
				f.setVisible(false);

			}
		});

	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Warning2
{
	public Warning2()
	{
		JFrame f = new JFrame("Process Exit");
		
		JLabel lobj1 = new JLabel("SORRY !!");
		lobj1.setBounds(190,2,200,100);
		
		JLabel lobj2 = new JLabel("Number of attempts finished");
		lobj2.setBounds(125,22,250,100);

		JLabel lobj3 = new JLabel("Better Luck Next Time");
		lobj3.setBounds(140,70,200,100);


		JButton bobj1 = new JButton("OK");
		bobj1.setBounds(180,150,70,40);

		
		 f.add(bobj1);
		 f.add(lobj1);
		 f.add(lobj2);
		 f.add(lobj3);

		f.setSize(450,250);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){

				System.exit(0);
				f.setVisible(false);

			}
		});

	}
}



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Packer
{
	public FileOutputStream outstream = null;

	public Packer(String FolderName,String FileName)
	{
		try
		{
			File outfile = new File(FileName);
			outstream = new FileOutputStream(FileName);

			System.setProperty("user.dir",FolderName);

			TravelDirectory(FolderName);
		
			Confirm cm = new Confirm();

		}
		catch(Exception obj)
		{
			Warning3 w3 = new Warning3();

			System.out.println("SORRY..."+obj+" !!!");
			System.out.println("Please enter valid contents !!!\n");
		
		}
	}


	public void TravelDirectory(String path)
	{
		File directoryPath = new File(path);

		int Counter = 0;

		File arr[] = directoryPath.listFiles();

		for(File Filename : arr)
		{
			// System.out.println(filename.getAbsolutePath());

			if(Filename.getName().endsWith(".txt")||Filename.getName().endsWith(".c")||Filename.getName().endsWith(".text/plain")||
			Filename.getName().endsWith(".cpp")||Filename.getName().endsWith(".java")||Filename.getName().endsWith(".class")||
			Filename.getName().endsWith(".jpg")||Filename.getName().endsWith(" ")||Filename.getName().endsWith(".python"))
			{
				Counter++;
				System.out.println("Packed file name: "+Filename.getName());

				PackFile(Filename.getAbsolutePath());
			}
		}
			System.out.println("--------------------------------");
			System.out.println("Succesfully packed files : "+Counter);
			System.out.println("--------------------------------");

 			System.out.println("\n_______________________________ Packing Complated _____________________________\n\n");


	}


	public void PackFile(String FilePath)
	{
		//System.out.println("File name received"+FilePath);

		byte Header[] = new byte[100];
		byte Buffer[] = new byte[1024];

		int length = 0;

		FileInputStream istream = null;

		File fobj = new File(FilePath);

		String temp = FilePath+" "+fobj.length();

		for(int i = temp.length(); i <100; i++)
		{
			temp = temp + " ";
		}

		Header = temp.getBytes();
		
		try
		{
			istream = new FileInputStream(FilePath);

			outstream.write(Header,0,Header.length);

			while((length = istream.read(Buffer))>0)
			{
				outstream.write(Buffer,0,length);
			}
			istream.close();
		}
		catch(Exception obj)
		{

			System.out.println("SORRY..."+obj+" !!!");
			System.out.println("Please enter valid contents again !!!\n");

		}
		
		System.out.println("Header : "+temp.length());
		
		System.out.println();

	}

}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




class Warning3
{
	public Warning3()
	{
		JFrame f = new JFrame("Invalid Creditionals");
		
		JLabel lobj1 = new JLabel("SORRY !!");
		lobj1.setBounds(190,2,200,100);
		
		JLabel lobj2 = new JLabel("There is no such folder");
		lobj2.setBounds(140,22,250,100);

		JLabel lobj3 = new JLabel("Something wrong");
		lobj3.setBounds(160,50,200,100);

		JLabel lobj4 = new JLabel("Packing failed");
		lobj4.setBounds(170,70,200,100);


		JButton bobj1 = new JButton("Re-Packing");
		bobj1.setBounds(60,150,120,40);

		JButton bobj2 = new JButton("Exit Process");
		bobj2.setBounds(270,150,120,40);

		
		 f.add(bobj1);
		 f.add(bobj2);
		 f.add(lobj1);
		 f.add(lobj2);
		 f.add(lobj3);
		 f.add(lobj4);

		f.setSize(450,250);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){

				System.exit(0);
				f.setVisible(false);

			}
		});



		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){

				Window w = new Window();
				f.setVisible(false);

			}
		});

	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Confirm
{
	public Confirm()
	{
		JFrame f = new JFrame("Packing Opration");
		
		JLabel lobj = new JLabel("File Packing Succesfully");
		lobj.setBounds(120,10,200,100);

		JButton bobj1 = new JButton("OK");
		bobj1.setBounds(160,100,70,40);

		
		 f.add(bobj1);
		 f.add(lobj);

		f.setSize(400,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){

				ChooseW cw = new ChooseW();
				f.setVisible(false);

			}
		});

	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




class Unpacker
{
	public FileOutputStream outstream = null;

	public Unpacker(String src)
	{
		//System.out.println("Inside Unpacker");
		unpackFile(src);
	}

	public void unpackFile(String FilePath)
	{
		try
		{
			FileInputStream instream = new FileInputStream(FilePath);

			byte Header[] = new byte[100];

			int length = 0;
			int Counter = 0;

			System.out.println("Unpack files gets created as : \n");
			while((length = instream.read(Header,0,100))>0)
			{
				String str = new String(Header);
				String ext = str.substring(str.lastIndexOf("/"));
				ext = ext.substring(1);

				String words[] = ext.split("\\s");
				String name = words[0];
				int size = Integer.parseInt(words[1]);

				byte arr[] = new byte[size];
				instream.read(arr,0,size);

				System.out.println(name);

				FileOutputStream fout = new FileOutputStream(name);

				fout.write(arr,0,size);
				Counter++;
			}

			System.out.println("\n--------------------------------");
			System.out.println("Succesfully unpacked files : "+Counter);
			System.out.println("--------------------------------");
 			System.out.println("\n______________________________ Unpacking Complated ____________________________\n\n");
			
			Confirm2 cm2 = new Confirm2();

		}
		catch(Exception obj)
		{
			Warning4 w4 = new Warning4();
			System.out.println("SORRY..."+obj+" !!!");
			System.out.println("Please enter valid contents !!!\n");
		}
	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Warning4
{
	public Warning4()
	{
		JFrame f = new JFrame("Invalid Creditionals");
		
		
		JLabel lobj1 = new JLabel("SORRY !!");
		lobj1.setBounds(190,2,200,100);
		
		JLabel lobj2 = new JLabel("There is no such file");
		lobj2.setBounds(150,22,250,100);

		
		JLabel lobj3 = new JLabel("Unpacking failed");
		lobj3.setBounds(160,60,200,100);


		JButton bobj1 = new JButton("Re-Unpacking");
		bobj1.setBounds(40,150,140,40);

		JButton bobj2 = new JButton("Exit Process");
		bobj2.setBounds(270,150,120,40);

		
		 f.add(bobj1);
		 f.add(bobj2);
		 f.add(lobj1);
		 f.add(lobj2);
		 f.add(lobj3);

		f.setSize(450,250);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){

				System.exit(0);
				f.setVisible(false);

			}
		});



		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){

				Window2 w2 = new Window2();
				f.setVisible(false);

			}
		});

	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Confirm2
{
	public Confirm2()
	{
		JFrame f = new JFrame("Unpacking Opration");
		
		JLabel lobj = new JLabel("File Unpacking Succesfully");
		lobj.setBounds(120,10,200,100);

		JButton bobj1 = new JButton("OK");
		bobj1.setBounds(160,100,70,40);

		
		 f.add(bobj1);
		 f.add(lobj);

		f.setSize(400,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bobj1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent eobj){

				ChooseW cw = new ChooseW();
				f.setVisible(false);

			}
		});

	}
}




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
