/* NIM & NAMA ANGGGOTA KELOMPOK:
2022105442 - Darrel Alvino Christhoper
2022105358 - Darren Christian
2022105369 - Hanlouis
*/

import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

//Class thread (Thread_1)
class MultiplicationThread extends Thread {
    private JTextArea textArea;

    public MultiplicationThread(String threadName, JTextArea textArea) {
        super(threadName);
        this.textArea = textArea;
    }

    @Override
    public void run() {
        //NIM & nama anggota kelompok
        appendText("2022105442 - Darrel Alvino Christhoper");
        appendText("2022105358 - Darren Christian");
        appendText("2022105369 - Hanlouis \n");

        // Time stamp awal
        appendText("Start Time: " + getCurrentTimeStamp());

        calculateFactorial();

        // Time stamp akhir
        appendText("End Time: " + getCurrentTimeStamp());

    }

    //Perkalian deret 1 sampai 100
    private BigInteger calculateFactorial() {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            appendText(factorial.divide(BigInteger.valueOf(i)) + " x " + i + " = " + factorial + "\n");
        }
        return factorial;
    }

    private void appendText(String message) {
        SwingUtilities.invokeLater(() -> {
            textArea.append(message + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
        });
    }

    private String getCurrentTimeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        return sdf.format(new Date());
    }
}

//Interface runnable (Thread_2)
class MultiplicationRunnable implements Runnable {
    private JTextArea textArea;

    public MultiplicationRunnable(String threadName, JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void run() {
        //NIM & nama anggota kelompok
        appendText("2022105442 - Darrel Alvino Christhoper");
        appendText("2022105358 - Darren Christian");
        appendText("2022105369 - Hanlouis \n");

        // Time stamp awal
        appendText("Start Time: " + getCurrentTimeStamp());

        calculateFactorial();

        // Time stamp akhir
        appendText("End Time: " + getCurrentTimeStamp());
    }

    //Perkalian deret 1 sampai 100
    private BigInteger calculateFactorial() {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            appendText(factorial.divide(BigInteger.valueOf(i)) + " x " + i + " = " + factorial + "\n");
        }
        return factorial;
    }

    private void appendText(String message) {
        SwingUtilities.invokeLater(() -> {
            textArea.append(message + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
        });
    }

    private String getCurrentTimeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        return sdf.format(new Date());
    }
}

public class MultiThreadGUI {
    public static void main(String[] args) {
        //frame1
        JFrame frame1 = new JFrame("Thread_1");
        frame1.setSize(500, 300);
        frame1.setLayout(new GridLayout(1, 1));
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);

        //textArea1
        JTextArea textArea1 = new JTextArea();
        textArea1.setEditable(false);
        JScrollPane scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame1.add(scrollPane1);

        //frame2
        JFrame frame2 = new JFrame("Thread_2");
        frame2.setSize(500, 300);
        frame2.setLayout(new GridLayout(1, 1));
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocationRelativeTo(null);

        //textArea2
        JTextArea textArea2 = new JTextArea();
        textArea2.setEditable(false);
        JScrollPane scrollPane2 = new JScrollPane(textArea2);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame2.add(scrollPane2);

        MultiplicationThread thread1 = new MultiplicationThread("Thread_1", textArea1);
        Thread thread2 = new Thread(new MultiplicationRunnable("Thread_2", textArea2));

        frame1.setVisible(true);
        frame2.setVisible(true);

        thread1.start();
        thread2.start();
        
    }
}