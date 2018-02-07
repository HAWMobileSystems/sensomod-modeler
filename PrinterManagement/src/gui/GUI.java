package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.event.MenuKeyListener;

import sensomod.generated.PrinterManagement;
import sensomod.generated.PrinterManagementState;

import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GUI {

	private JFrame frmPrinterManagement;
	private PrinterManagement pm = new PrinterManagement();
	private JMenu mnPaper = new JMenu("Paper");
	private JMenu mnOrder = new JMenu("Order");
	private JLabel labelLocation = new JLabel("        ");
	private JLabel labelPrinterStatus = new JLabel("        ");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmPrinterManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmPrinterManagement = new JFrame();
		frmPrinterManagement.setTitle("Printer Management");
		frmPrinterManagement.setBounds(100, 100, 628, 224);
		frmPrinterManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frmPrinterManagement.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		mnFile.add(mntmExit);

		menuBar.add(mnOrder);

		JMenuItem mntmOrderCartridge = new JMenuItem("Order cartridge");
		mnOrder.add(mntmOrderCartridge);

		mnOrder.setEnabled(false);

		menuBar.add(mnPaper);

		JMenuItem mntmRefillPaper = new JMenuItem("Refill Paper");
		mnPaper.add(mntmRefillPaper);
		mnPaper.setEnabled(false);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		frmPrinterManagement.getContentPane().add(panel, BorderLayout.SOUTH);

		JLabel lblStatus = new JLabel("Status");
		lblStatus.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblStatus);

		JLabel lblLocation = new JLabel("Location: ");
		panel.add(lblLocation);

		panel.add(labelLocation);

		JSeparator separator = new JSeparator();
		panel.add(separator);

		JLabel lblPrinterStatus = new JLabel("Printer Status: ");
		panel.add(lblPrinterStatus);

		panel.add(labelPrinterStatus);

		JPanel panel_1 = new JPanel();
		frmPrinterManagement.getContentPane().add(panel_1, BorderLayout.CENTER);

		JButton btnPrinter1 = new JButton("Printer Room 1");
		btnPrinter1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetPrinterMangement();
				labelLocation.setText("SSID_WlanRoom1");
				labelPrinterStatus.setText(pm.output("WlanRoom1").state.toString());
				switch (pm.output("WlanRoom1").state) {
				case RefillPaperPrinter:
					setButtonEnabled(mnPaper);
					break;
				case OrderCartridgePrinter:
					setButtonEnabled(mnOrder);
					break;
				default:
					break;
				}
			}
		});
		btnPrinter1.setIcon(new ImageIcon(GUI.class.getResource("/img/printer.jpg")));
		btnPrinter1.setContentAreaFilled(false);
		panel_1.add(btnPrinter1);

		JButton btnPrinter2 = new JButton("Printer Room 2");
		btnPrinter2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPrinterMangement();
				labelLocation.setText("SSID_WlanRoom2");
				labelPrinterStatus.setText(pm.output("WlanRoom2").state.toString());
				switch (pm.output("WlanRoom2").state) {
				case RefillPaperPrinter:
					setButtonEnabled(mnPaper);
					break;
				case OrderCartridgePrinter:
					System.out.println("nase1");
					setButtonEnabled(mnOrder);
					break;
				default:
					break;
				}
			}
		});
		btnPrinter2.setIcon(new ImageIcon(GUI.class.getResource("/img/printer.jpg")));
		btnPrinter2.setContentAreaFilled(false);
		panel_1.add(btnPrinter2);

		JButton btnPrinter3 = new JButton("Printer Room 3");
		btnPrinter3.setIcon(new ImageIcon(GUI.class.getResource("/img/printer.jpg")));
		btnPrinter3.setContentAreaFilled(false);
		btnPrinter3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPrinterMangement();
				labelLocation.setText("SSID_WlanRoom3");
				labelPrinterStatus.setText(pm.output("WlanRoom3").state.toString());
				switch (pm.output("WlanRoom3").state) {
				case RefillPaperPrinter:
					setButtonEnabled(mnPaper);
					break;
				case OrderCartridgePrinter:
					setButtonEnabled(mnOrder);
					break;
				default:
					break;
				}
			}
		});
		panel_1.add(btnPrinter3);

		JButton btnAnywhereElse = new JButton("Anywhere else");
		btnAnywhereElse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPrinterMangement();
				labelLocation.setText("AnyWhereElse");
				labelPrinterStatus.setText(pm.output("AnyWhereElse").state.toString());
				switch (pm.output("AnyWhereElse").state) {
				case RefillPaperPrinter:
					setButtonEnabled(mnPaper);
					break;
				case OrderCartridgePrinter:
					setButtonEnabled(mnOrder);
					break;
				default:
					break;
				}
			}
		});
		panel_1.add(btnAnywhereElse);
	}


	private void resetPrinterMangement() {
		mnPaper.setEnabled(false);
		mnOrder.setEnabled(false);
		pm = new PrinterManagement();
		labelLocation.setText("        ");
		labelPrinterStatus.setText("        ");

	}

	private void setButtonEnabled(JMenu jmenu) {
		jmenu.setEnabled(true);
	}

}
