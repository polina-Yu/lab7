package lab6;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;  
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Reader extends JFrame {
	int k=0, p=0, val=0;
	Object boxA, boxB, boxC, boxD;
	File file = new File("C:\\lab6\\GUI.doc");
	static JLabel labelCategory, labelDish, labelWeight, labelServe, labelName, labelTable, labelPortions, labelWish;
	JComboBox boxTable, boxWeight, boxPortions, boxCategory;
	JRadioButton flag1, flag2;
        JCheckBox check;
	JSlider slider;
        ButtonGroup bg;
	static JButton b, del;
	static JTextField textName;
	static JTextArea areaDish, areaWish;
	static String[] box1 = {"Выберите вес","100","200","300","400","500", "Много"};
	static String[] box2 = {"Выберите порции","1","2","3","4","5","6","7","8","9","10"};
	static String[] box3 = {"Выберите столик","1","2","3","4","5","6"};
        static String[] box4 = {"Выберите категорию","Горячее","Закуски","Десерты","Детское меню","Напитки","Другое"};
        Font f = new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 14);
        Font f1 = new Font("Geneva", Font.BOLD, 12);
        ImageLabel iconWeight = new ImageLabel(new ImageIcon("C:\\Users\\Note\\Desktop\\scales1.png"));
        ImageLabel iconTable = new ImageLabel(new ImageIcon("C:\\Users\\Note\\Desktop\\table.png"));
        ImageLabel icon = new ImageLabel(new ImageIcon("C:\\Users\\Note\\Desktop\\food.jpg"));
        
	public Reader(String str){
		super(str);
		setSize(500, 430);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		b = new JButton("Заказать");
		del = new JButton("Очистить");
		textName = new JTextField(9);
		areaDish = new JTextArea(9, 9);
                areaWish = new JTextArea(9, 9);
		labelCategory = new JLabel("Категория");
		labelDish = new JLabel("Название");
		labelWeight = new JLabel("Вес");
		labelServe = new JLabel("Подача");
		labelName = new JLabel("Имя");
		labelTable = new JLabel("Стол");
		labelPortions = new JLabel("Порции");
		labelWish = new JLabel("Пожелания");
		boxWeight = new JComboBox(box1);
		boxPortions = new JComboBox(box2);
		boxTable = new JComboBox(box3);
                boxCategory = new JComboBox(box4);
		flag1 = new JRadioButton("в зале");
		flag2 = new JRadioButton("с собой");
                check = new JCheckBox("Дополнительные приборы");
                slider = new JSlider(JSlider.HORIZONTAL, 0, 1000, 500);
		bg = new ButtonGroup();
		bg.add(flag1);
		bg.add(flag2);
                
		setLayout(null);

                b.setBackground(Color.lightGray);
                b.setSize(100, 30);
		b.setLocation(375, 355);	
                del.setBackground(Color.lightGray);
                del.setSize(110, 30);
		del.setLocation(25, 355);

                textName.setSize(125, 25);
		textName.setLocation(75, 25);
//                textName.setBackground(new Color(0,0,0, (float) 0.1));
                textName.setBackground(new Color(250,250,250));

		areaDish.setSize(250, 25);
		areaDish.setLocation(225, 120);
                areaDish.setBackground(new Color(250,250,250));
//                areaDish.setBackground(new Color(0,0,0,0.01f));
                areaWish.setSize(250, 50);
		areaWish.setLocation(225, 295);
                areaWish.setBackground(new Color(250,250,250));
//                areaWish.setBackground(new Color(0,0,0,0));
                
                labelName.setSize(50, 25);
		labelName.setLocation(25, 25);
                labelTable.setSize(50, 25);
		labelTable.setLocation(250, 25);
		labelCategory.setSize(100, 25);
		labelCategory.setLocation(25, 75);
		labelDish.setSize(100, 25);
		labelDish.setLocation(25, 120);
		labelWeight.setSize(50, 25);
		labelWeight.setLocation(25, 200);               
                labelPortions.setSize(75, 25);
		labelPortions.setLocation(265, 200);
		labelServe.setSize(75, 25);
		labelServe.setLocation(25, 250);
		labelWish.setSize(100,25);
		labelWish.setLocation(25, 295);
                
                iconWeight.setLocation(25,190); 
                iconTable.setLocation(265,15);
                icon.setLocation(0,0);
                
                boxTable.setSize(150, 25);
		boxTable.setLocation(325, 25);
                boxTable.setBackground(new Color(250,250,250));
//                boxTable.setBackground(new Color(0,0,0,0));
                boxCategory.setSize(175, 25);
		boxCategory.setLocation(225, 75);
                boxCategory.setBackground(new Color(250,250,250));
//                boxCategory.setBackground(new Color(0,0,0,0));
		boxWeight.setSize(125, 25);
		boxWeight.setLocation(75, 200);
                boxWeight.setBackground(new Color(250,250,250));
//                boxWeight.setBackground(new Color(0,0,0,0));
		boxPortions.setSize(150, 25);
		boxPortions.setLocation(325, 200);
                boxPortions.setBackground(new Color(250,250,250));
//                boxPortions.setBackground(new Color(0,0,0,0));
                
		flag1.setSize(100,25);
		flag1.setLocation(225, 250);
                flag1.setBackground(new Color(250,250,250));
//                flag1.setBackground(new Color(0,0,0,0));
		flag2.setSize(125, 25);
		flag2.setLocation(350, 250);
                flag2.setBackground(new Color(250,250,250));
//                flag2.setBackground(new Color(0,0,0,0));
                
                check.setSize(185, 25);
                check.setLocation(25, 150);
                check.setBackground(new Color(250,250,250));
//                check.setBackground(new Color(0,0,0,0));
                
                slider.setSize(175, 50);
                slider.setLocation(65,190);
                slider.setPaintLabels(true);
                slider.setPaintTicks(true);
                slider.setMinorTickSpacing(100);
                slider.setMajorTickSpacing(500);
                slider.setLabelTable(slider.createStandardLabels(500));
                slider.setBackground(new Color(250,250,250));
//                slider.setBackground(new Color(0,0,0, (int) 0.5));
                
		add(b);
		add(del);
		add(textName);
		add(areaDish);
                add(areaWish);
                add(labelName);
//              add(labelTable);
		add(labelCategory);
		add(labelDish);
//		add(labelWeight);
                add(iconWeight);
                add(labelPortions);
		add(labelServe);
                add(labelWish);
                add(boxTable);
                add(boxCategory);
//		add(boxWeight);
                add(iconTable);
		add(boxPortions);
		add(flag1);
		add(flag2);
                add(check);
                add(slider);
                add(icon);
		
		b.addActionListener(new ButtonActionListener());
		b.addMouseListener(new ButtonActionLisener());
                del.addActionListener(new DelActionListener());
		del.addMouseListener(new ButtonActionLisener());
                flag1.addActionListener(new FlagActionListener());
		flag2.addActionListener(new FlagActionListener());
		boxTable.addActionListener(new BoxActionListener());
                boxCategory.addActionListener(new BoxActionListener());
		boxWeight.addActionListener(new BoxActionListener());
		boxPortions.addActionListener(new BoxActionListener());
                check.addActionListener(new CheckActionListener());
                slider.addChangeListener(new SliderListener());
	}

	public class ButtonActionListener implements ActionListener {		
            @Override
		public void actionPerformed(ActionEvent e) {	
			try{
				if(!file.exists()){
					file.createNewFile();
				}
				try(FileWriter out = new FileWriter(file, true)) {		
					String text1 = textName.getText();
					String area2 = areaDish.getText();
                                        String area3 = areaWish.getText();
					out.write("\n " + text1 + " - ");
                                        out.write(" Стол:" + boxA + "; Категория: " + boxB);
                                        out.write(" Название: " + area2 + "\n");
                                        if(p == 1)
                                        out.write(" Нужны доп.приборы;");
					out.write(" Вес:" + val + "; Порций: " + boxD);
                                        if(k == 1)
						out.write(" Заказ в зале. " + "\n");
					else if(k == -1)
						out.write(" Заказ с собой. " + "\n");
					out.write(" " +area3 + "\n");
					}
				}catch(IOException e1){
					throw new RuntimeException(e1);
			}	
		}
	}
	public class FlagActionListener implements ActionListener {
            @Override
		public void actionPerformed(ActionEvent e) {
			k = 0;
			if(e.getSource() == flag1){
				k++;
			}
			else if(e.getSource() == flag2){
				k--;
			}
		}		
	}
	public class DelActionListener implements ActionListener{
            @Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == del){
				textName.setText(null);
				areaDish.setText(null);
				areaWish.setText(null);
			}
		}
	}	
	public class BoxActionListener implements ActionListener{
            @Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource() == boxTable){
					boxA = boxTable.getSelectedItem();
                                }
				if(e.getSource() == boxCategory){
					boxB = boxCategory.getSelectedItem();
                                }
                                if(e.getSource() == boxWeight){
					boxC = boxWeight.getSelectedItem();
				}
				if(e.getSource() == boxPortions){
					boxD = boxPortions.getSelectedItem();
				}
                 }
	}
        public class CheckActionListener implements ActionListener{
            @Override
                public void actionPerformed(ActionEvent e) {
                                if(e.getSource() == check)
                                   p++; 
                }
        }
        public class ButtonActionLisener implements MouseListener{
        @Override
            public void mouseClicked(MouseEvent e) {

            }
        @Override
            public void mouseEntered(MouseEvent e) {
                if (b == (JButton) e.getSource()){
                    b.setFont(f);
                    b.setBackground(new Color(102,255,102));
                }
                if (del == (JButton) e.getSource()){
                    del.setFont(f);
                    del.setBackground(new Color(255,102,102));
                }            
            }
        @Override
            public void mouseExited(MouseEvent e) {
                if (b == (JButton) e.getSource()){
                    b.setFont(f1);
                    b.setBackground(Color.lightGray);
                }
                if (del == (JButton) e.getSource()){
                    del.setFont(f1);
                    del.setBackground(Color.lightGray);
                }            
            }
        @Override
            public void mousePressed(MouseEvent e) {
                if (b == (JButton) e.getSource()){
                    b.setBackground(new Color(0,153,0));
                }
                if (del == (JButton) e.getSource()){
                    del.setBackground(new Color(255,51,51));
                } 
            }
        @Override
            public void mouseReleased(MouseEvent e) {
                if (b == (JButton) e.getSource()){
                    b.setBackground(new Color(0,153,0));
             }
            if (del == (JButton) e.getSource()){
                del.setBackground(new Color(255,51,51));
            } 
        }
    }	
        private class SliderListener implements ChangeListener {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(e.getSource()==slider){
                        val = slider.getValue();
                }
            }
        }        
}