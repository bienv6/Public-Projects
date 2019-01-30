import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import sun.applet.Main;

public class Pizza extends JFrame {
	
		private JButton btlH2o;
	    private JButton cancel;
	    private JButton chicken;
	    private JButton ham;
	    private JLabel jLabel1;
	    private JPanel jPanel1;
	    private JPanel jPanel2;
	    private JScrollPane jScrollPane1;
	    private JSplitPane jSplitPane1;
	    private JButton lrgPizza;
	    private JButton medPizza;
	    private JTextArea outPut;
	    private JButton peperoni;
	    private JButton sausage;
	    private JButton smallPizza;
	    private JButton soda;
	    private JButton submit;
	    private JButton tapH2o;
	    private JButton tea;
	    private JButton xlargPizza;
	   //End of Variable Decloration  
	    
	    private double price=0, sub=0, total=0;
	    private double tax = .065;
	    private int qty =1;
	    private int count = 0;
	    private String item;
	    public DecimalFormat df = new DecimalFormat("0.00");
	    private boolean pizzaselected = false;
	    private boolean oderSubmitted = false;
	    private int pizzacount = 0;
	    private int toppingscount = 0;
	    private int toppingslimit;
	    

	    
	    
	    public void print(String a, double j){
	    	String order;
	    	
	    	qty = 1;
	        item = a;
	        price = j;
	        sub+= price;
	        order= qty + "\t"+ item +"\t$ "+ df.format(price)+ "\n";
	        outPut.append(order);
	           
	        
	 } 
	    
	   
	   public void printTotal(){
	        tax = sub * tax;
	        total = sub + tax;
	        outPut.append("\n\n\n\tSub: " + df.format(sub) +"\n\tTax: "+ 
	        df.format(tax) +"\n\tTotal: "+ df.format(total));
	        	    
	    }
	    
	    public void addPizza(String p, double c){
	    	
	    	
	       	pizzaselected = true;
	       	if(pizzaselected == true && pizzacount==0) {print(p,c); pizzacount++;}
	       	
	       	else if(pizzaselected == true && pizzacount > 0 && toppingscount > 0 ) {print(p,c); toppingscount=0;}
	    	
	       	else if(pizzaselected == true && pizzacount > 0 && toppingscount <1) {
	       		JOptionPane.showMessageDialog(null, "Please add toppings before adding another pizza");
	    	}
	    	else {
	    		JOptionPane.showMessageDialog(null, "Please add toppings before adding another pizza");
	    	}
	    	
	       
	        }
	      
	     public void addBev(String b, double p){
	    	 if(pizzaselected == true && toppingscount > 0) {
	    		 print(b,p);
	    	 }
	    	 else {
	    		 JOptionPane.showMessageDialog(null,"You must select a Pizza & toppings before beverage" );
	    	 }
	         
	    }
	     
	      public void addToppings(String t, double p){
	    	  
	    	  toppingslimit = pizzacount * 4;
	    	  
	    	  if(pizzaselected == true) 
	    	  	{ 
	    		  if(toppingscount < toppingslimit) {
	    	    	 print(t,p);
	    	    	 toppingscount++; }
	    	     else {
	    	    	 JOptionPane.showMessageDialog(null," Limit 4 toppings per pizza " );
	    	     }
	    	  }
	    	  else {
	    		  JOptionPane.showMessageDialog(null,"You must select Pizza size before toppings" );
	    	  }
	     
	    }
	      
	      private void showElements() {

	          jPanel1 = new javax.swing.JPanel();
	          jLabel1 = new javax.swing.JLabel();
	          jSplitPane1 = new javax.swing.JSplitPane();
	          jPanel2 = new javax.swing.JPanel();
	          smallPizza = new javax.swing.JButton();
	          lrgPizza = new javax.swing.JButton();
	          xlargPizza = new javax.swing.JButton();
	          medPizza = new javax.swing.JButton();
	          soda = new javax.swing.JButton();
	          tea = new javax.swing.JButton();
	          btlH2o = new javax.swing.JButton();
	          tapH2o = new javax.swing.JButton();
	          peperoni = new javax.swing.JButton();
	          sausage = new javax.swing.JButton();
	          chicken = new javax.swing.JButton();
	          ham = new javax.swing.JButton();
	          submit = new javax.swing.JButton();
	          cancel = new javax.swing.JButton();
	          jScrollPane1 = new javax.swing.JScrollPane();
	          outPut = new javax.swing.JTextArea();

	          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	          setMaximumSize(new java.awt.Dimension(800, 400));
	          setMinimumSize(new java.awt.Dimension(800, 400));
	          setPreferredSize(new java.awt.Dimension(600, 400));

	          jPanel1.setMaximumSize(new java.awt.Dimension(800, 100));
	          jPanel1.setMinimumSize(new java.awt.Dimension(800, 100));

	          jLabel1.setText("INFERNO PIZZA");

	          jSplitPane1.setBackground(new java.awt.Color(255, 0, 0));
	          jSplitPane1.setDividerLocation(435);
	          jSplitPane1.setDividerSize(50);

	          jPanel2.setMaximumSize(new java.awt.Dimension(400, 400));

	          smallPizza.setText("SMALL");
	          smallPizza.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  smallPizzaActionPerformed(evt);
	              }
	          });

	          lrgPizza.setText("LARGE");
	          lrgPizza.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  lrgPizzaActionPerformed(evt);
	              }
	          });

	          xlargPizza.setText("X-LARGE");
	          xlargPizza.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  xlargPizzaActionPerformed(evt);
	              }
	          });

	          medPizza.setText("MEDIUM");
	          medPizza.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  medPizzaActionPerformed(evt);
	              }
	          });

	          soda.setText("SODA ");
	          soda.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  sodaActionPerformed(evt);
	              }
	          });

	          tea.setText("ICED TEA");
	          tea.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  teaActionPerformed(evt);
	              }
	          });

	          btlH2o.setText("BTL WATER");
	          btlH2o.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  btlH2oActionPerformed(evt);
	              }
	          });

	          tapH2o.setText("TAP WATER");
	          tapH2o.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  tapH2oActionPerformed(evt);
	              }
	          });

	          peperoni.setText("Peperoni");
	          peperoni.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  peperoniActionPerformed(evt);
	              }
	          });

	          sausage.setText("Sausage");
	          sausage.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  sausageActionPerformed(evt);
	              }
	          });

	          chicken.setText("Chicken");
	          chicken.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  chickenActionPerformed(evt);
	              }
	          });

	          ham.setText("Ham");
	          ham.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  hamActionPerformed(evt);
	              }
	          });

	          submit.setText("SUBMIT");
	          submit.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  submitActionPerformed(evt);
	              }
	          });

	          cancel.setText("CANCEL");
	          cancel.addActionListener(new java.awt.event.ActionListener() {
	              public void actionPerformed(java.awt.event.ActionEvent evt) {
	                  cancelActionPerformed(evt);
	              }
	          });

	          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	          jPanel2.setLayout(jPanel2Layout);
	          jPanel2Layout.setHorizontalGroup(
	              jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	              .addGroup(jPanel2Layout.createSequentialGroup()
	                  .addContainerGap()
	                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                      .addGroup(jPanel2Layout.createSequentialGroup()
	                          .addComponent(smallPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                          .addComponent(medPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                          .addComponent(lrgPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                          .addComponent(xlargPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                          .addGap(0, 0, Short.MAX_VALUE))
	                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                          .addGap(0, 0, Short.MAX_VALUE)
	                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                                  .addComponent(peperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                  .addComponent(sausage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                  .addComponent(chicken, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                  .addComponent(ham, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
	                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                                  .addComponent(soda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                  .addComponent(tea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                  .addComponent(btlH2o, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                  .addComponent(tapH2o, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
	                  .addContainerGap())
	              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                  .addComponent(submit)
	                  .addGap(34, 34, 34)
	                  .addComponent(cancel)
	                  .addGap(24, 24, 24))
	          );
	          jPanel2Layout.setVerticalGroup(
	              jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	              .addGroup(jPanel2Layout.createSequentialGroup()
	                  .addContainerGap()
	                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                      .addComponent(smallPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(lrgPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(xlargPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(medPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
	                  .addGap(13, 13, 13)
	                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                      .addComponent(peperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(chicken, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(ham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(sausage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
	                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                      .addComponent(soda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(btlH2o, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(tapH2o, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                      .addComponent(tea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
	                  .addGap(18, 18, 18)
	                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                      .addComponent(submit)
	                      .addComponent(cancel))
	                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	          );

	          jSplitPane1.setLeftComponent(jPanel2);

	          outPut.setColumns(20);
	          outPut.setRows(5);
	          jScrollPane1.setViewportView(outPut);

	          jSplitPane1.setRightComponent(jScrollPane1);

	          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	          jPanel1.setLayout(jPanel1Layout);
	          jPanel1Layout.setHorizontalGroup(
	              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	              .addGroup(jPanel1Layout.createSequentialGroup()
	                  .addGap(168, 168, 168)
	                  .addComponent(jLabel1)
	                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	              .addGroup(jPanel1Layout.createSequentialGroup()
	                  .addContainerGap()
	                  .addComponent(jSplitPane1)
	                  .addContainerGap())
	          );
	          jPanel1Layout.setVerticalGroup(
	              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	              .addGroup(jPanel1Layout.createSequentialGroup()
	                  .addGap(35, 35, 35)
	                  .addComponent(jLabel1)
	                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
	                  .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	          );

	          getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

	          pack();
	      }// </editor-fold>             

	    
	    private void cancelActionPerformed(ActionEvent evt) {  
	    		if(count ==1) {
	    			System.exit(0);
	    		}
	    		else {
	    			outPut.setText("");
	    			sub = 0;	
	    		}
	    }                                      

	    private void submitActionPerformed(ActionEvent evt) { 
	    	
	    	 if (count ==1) {
	    		  dispose();
		    	  main(null);
	    	  }
	    	 else {
		    	  printTotal();
		    	  submit.setText("New Order");
		    	  cancel.setText("Exit");
		    	  count++;
	    	  }
	    	 
	    }                                      

	    private void hamActionPerformed(ActionEvent evt) {                                    
	        addToppings("Ham", 1.00);
	    }                                   

	    private void chickenActionPerformed(ActionEvent evt) {                                        
	        addToppings("Chicken", 1.00);
	    }                                       

	    private void sausageActionPerformed(ActionEvent evt) {                                        
	        addToppings("Sausage", 1.00);
	    }                                       

	    private void peperoniActionPerformed(ActionEvent evt) {                                         
	        addToppings("Peperoni", 1.00);
	    }                                        

	    private void tapH2oActionPerformed(ActionEvent evt) {                                       
	        addBev("Tap Water", 0.00);
	    }                                      

	    private void btlH2oActionPerformed(ActionEvent evt) {                                       
	        addBev("BTL Water", 1.25);
	    }                                      

	    private void teaActionPerformed(ActionEvent evt) {                                    
	        addBev("Iced Tea", 1.50);
	    }                                   

	    private void sodaActionPerformed(ActionEvent evt) {                                     
	        addBev("Fountain Soda",2.00);
	    }                                    

	    private void medPizzaActionPerformed(ActionEvent evt) {                                         
	        addPizza("Medium Pizza ",9.00);
	    }                                        

	    private void xlargPizzaActionPerformed(ActionEvent evt) {                                           
	        addPizza("X-Large Pizza ", 14.00);
	    }                                          

	    private void lrgPizzaActionPerformed(ActionEvent evt) {                                         
	        addPizza("Large Pizza ", 11.00);
	    }                                        

	    private void smallPizzaActionPerformed(ActionEvent evt) {                                           
	        addPizza("Small Pizza", 7.00);
	    }  
	    
	    
	public Pizza() {
		showElements();
	 
	}
	
public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
            }
        });
    }
}