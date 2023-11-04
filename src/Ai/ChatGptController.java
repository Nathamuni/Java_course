package Ai;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URLEncoder;

 class ChatGPTSearchApp extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;

    public ChatGPTSearchApp() {
        super("ChatGPT Search App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create input field and search button
        inputField = new JTextField(30);
        JButton searchButton = new JButton("Search");

        // Create output area
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputField, BorderLayout.NORTH);
        contentPane.add(searchButton, BorderLayout.CENTER);
        contentPane.add(scrollPane, BorderLayout.SOUTH);

        // Set up search button listener
        searchButton.addActionListener(new SearchButtonListener());

        // Display the window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class SearchButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputText = inputField.getText();
            String reply = searchChatGPT(inputText);

            outputArea.setText(reply);
        }
    }

    private String searchChatGPT(String inputText) {
        try {
            // Replace 'YOUR_API_KEY' with your actual ChatGPT API key
            String apiKey = "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";
            String url = "https://api.openai.com/v1/chat/completions";
            String prompt = "ChatGPT: " + inputText;

            Document document = Jsoup.connect(url)
                    .header("Authorization", "Bearer " + apiKey)
                    .data("model", "gpt-3.5-turbo")
                    .data("messages", "[{\"role\": \"system\", \"content\": \"You are a helpful assistant.\"}, {\"role\": \"user\", \"content\": \"" + prompt + "\"}]")
                    .post();

            Element replyElement = document.selectFirst(".message[data-role=\"assistant\"]");
            if (replyElement != null) {
                String reply = replyElement.text();
                return reply.trim();
            }

            return "Reply not found.";
        } catch (IOException ex) {
            ex.printStackTrace();
            return "Error: " + ex.getMessage();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChatGPTSearchApp());
    }
}
