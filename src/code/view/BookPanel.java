package code.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import code.controller.BookController;

public class BookPanel extends JPanel
{
    private BookController baseController;
    
    private SpringLayout baseLayout;
    
    private JButton randomPagesButton;
    
    private JLabel title;
    
    private JTextArea numberOfPages;
    
    public BookPanel(BookController baseController)
    {
	baseController = new BookController();
	baseLayout = new SpringLayout();
	randomPagesButton = new JButton();
	title = new JLabel("Here is a book with a random number of pages");
	numberOfPages = new JTextArea(5, 25);
	
	setupPanel();
	setupLayout();
	setupListeners();
    }
    
    public void setupPanel()
    {
	this.setLayout(baseLayout);
	this.add(randomPagesButton);
	this.add(title);
	this.add(numberOfPages);
	
	this.setBackground(new Color(130, 100, 50));
	this.setSize(300, 300);
	numberOfPages.setWrapStyleWord(true);
	numberOfPages.setLineWrap(true);
    }
    
    public void setupLayout()
    {
	
    }
    
    public void setupListeners()
    {
	randomPagesButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			
		}
	});
    }
    
}
