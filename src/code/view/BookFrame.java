package code.view;

import code.controller.BookController;
import code.view.BookPanel;

import javax.swing.JFrame;

import code.controller.BookController;

public class BookFrame extends JFrame
{
    private BookController baseController;
    private BookPanel basePanel;

    public BookFrame(BookController baseController)
    {
	this.baseController = baseController;
	basePanel = new BookPanel(baseController);

	setupFrame();
    }

    private void setupFrame()
    {
	this.setContentPane(basePanel);
	this.setSize(300, 300);
	this.setVisible(true);
    }
}
