package com.company.myPackage;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;


public class Main extends JFrame  {


      ArrayList<String> countries = new ArrayList<>(Arrays.asList("Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antigua &amp; Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia &amp; Herzegovina", "Botswana", "Brazil", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central Arfrican Republic", "Chad", "Chile", "China", "Colombia", "Congo", "Cook Islands", "Costa Rica", "Cote D Ivoire", "Croatia", "Cuba", "Curacao", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Polynesia", "French West Indies", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea Bissau", "Guyana", "Haiti", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauro", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russia", "Rwanda", "Saint Pierre &amp; Miquelon", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "St Kitts &amp; Nevis", "St Lucia", "St Vincent", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor L'Este", "Togo", "Tonga", "Trinidad &amp; Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks &amp; Caicos", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States of America", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Virgin Islands (US)", "Yemen", "Zambia", "Zimbabwe","afghanistan", "albania", "algeria", "andorra", "angola", "anguilla", "antigua &amp; Barbuda", "argentina", "armenia", "aruba", "australia", "austria", "azerbaijan", "bahamas", "bahrain", "bangladesh", "barbados", "belarus", "belgium", "belize", "benin", "bermuda", "bhutan", "bolivia", "bosnia &amp; Herzegovina", "botswana", "brazil", "british Virgin Islands", "brunei", "bulgaria", "burkina Faso", "burundi", "cambodia", "cameroon", "canada", "cape verde", "cayman islands", "central arfrican republic", "chad", "chile", "china", "colombia", "congo", "cook islands", "costa rica", "cote d ivoire", "croatia", "cuba", "curacao", "cyprus", "czech republic", "denmark", "djibouti", "dominica", "dominican republic", "ecuador", "egypt", "el salvador", "equatorial guinea", "eritrea", "estonia", "ethiopia", "ealkland islands", "faroe islands", "fiji", "finland", "france", "french polynesia", "french west indies", "gabon", "gambia", "georgia", "germany", "ghana", "gibraltar", "greece", "greenland", "grenada", "guam", "guatemala", "guernsey", "guinea", "guinea bissau", "guyana", "haiti", "honduras", "hong kong", "hungary", "iceland", "india", "indonesia", "iran", "iraq", "ireland", "isle of man", "israel", "italy", "jamaica", "japan", "jersey", "jordan", "kazakhstan", "kenya", "kiribati", "kosovo", "kuwait", "kyrgyzstan", "laos", "latvia", "lebanon", "lesotho", "liberia", "libya", "liechtenstein", "lithuania", "luxembourg", "macau", "macedonia", "madagascar", "malawi", "malaysia", "maldives", "mali", "mlta", "marshall islands", "mauritania", "mauritius", "mexico", "micronesia", "moldova", "monaco", "mongolia", "montenegro", "montserrat", "morocco", "mozambique", "myanmar", "namibia", "nauro", "nepal", "netherlands", "netherlands antilles", "new caledonia", "new zealand", "nicaragua", "niger", "nigeria", "north korea", "norway", "oman", "pakistan", "palau", "palestine", "panama", "papua new guinea", "paraguay", "peru", "philippines", "poland", "portugal", "puerto rico", "qatar", "reunion", "romania", "russia", "rwanda", "saint pierre &amp; miquelon", "samoa", "san marino", "sao tome and principe", "saudi arabia", "senegal", "serbia", "seychelles", "sierra leone", "singapore", "slovakia", "slovenia", "solomon islands", "somalia", "south africa", "south korea", "south sudan", "spain", "sri lanka", "st kitts &amp; nevis", "st lucia", "st vincent", "sudan", "suriname", "swaziland", "sweden", "switzerland", "syria", "taiwan", "tajikistan", "tanzania", "thailand", "timor l'este", "togo", "tonga", "trinidad &amp; tobago", "tunisia", "turkey", "turkmenistan", "turks &amp; caicos", "tuvalu", "tganda", "tkraine", "united arab emirates", "united kingdom", "united states of america", "uruguay", "uzbekistan", "vanuatu", "vatican City", "venezuela", "vietnam", "virgin islands (US)", "yemen", "zambia", "zimbabwe"));
    JTextField txt1 = new JTextField("ENTER COUNTRY",15);

    JTable table;
    Object[] row;
    DefaultTableModel model;
    String arr[];
    HashMap<String, String> map = new HashMap<String, String>();

    Main() {


        JFrame frame = new JFrame("CORONA INFORMATION SYSTEM");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label1 = new JLabel("CORONA INFORMATION SYSTEM");



        JButton button = new JButton("SEARCH");
        button.setBounds(40, 100, 100, 60);


        Object[] colomns = {"Country Name", "Total Cases", "Total Death", "Total Recovered"};
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colomns);
        table.setModel(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 135, 464, 115);
        Font font = new Font("Arial", Font.BOLD, 20);
        label1.setFont(font);
        txt1.setHorizontalAlignment(SwingConstants.CENTER);
        button.setHorizontalAlignment(SwingConstants.CENTER);

        row = new Object[8];

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String data = txt1.getText();
                    getData(data);

                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });



        frame.setLayout(new FlowLayout());
        frame.add(label1);

        frame.add(txt1);
        txt1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                switch (e.getKeyCode()){
                    case KeyEvent.VK_BACK_SPACE:
                        break;
                    case KeyEvent.VK_ENTER:
                        txt1.setText(txt1.getText());
                        break;
                    default:
                        EventQueue.invokeLater(new Runnable() {
                            @Override
                            public void run() {

                                String txt = txt1.getText();
                                autocomplete(txt);
                            }
                        });
                }
            }
        });

        frame.add(button);
        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }



    public void getData(String country) throws Exception {
        StringBuffer br = new StringBuffer();
        String url = "https://www.worldometers.info/coronavirus/country/" + country + "/";
        Document doc = Jsoup.connect(url).get();
        Elements element = doc.select("div#maincounter-wrap");
        DefaultTableModel m = (DefaultTableModel) table.getModel();
        Vector<String> row = new Vector<>();
        row.add(country);
        for (Element element1 : element) {
           // String text = element1.select("a").text();
            Elements elements = element1.select("#div.maincounter");
            String text2 = elements.select("spam").text();
            String num = element1.select(".maincounter-number").select("span").text();
            map.put(text2, num);
            for (Map.Entry map : map.entrySet()) {
                row.add(element1.select(".maincounter-number").text());
            }
        }
        m.addRow(row);
    }

    public void autocomplete(String txt){

        String complete = "";
        int start = txt.length();
        int last = txt.length();
        int a;
        for( a=0; a<countries.size();a++){

            if(countries.get(a).toString().startsWith(txt)){
                complete = countries.get(a).toString();
                last = complete.length();
                break;
            }
        }

        if(last>start){

            txt1.setText(complete);
            txt1.setCaretPosition(last);
            txt1.moveCaretPosition(start);
        }
    }

    public static void main(String[] args) throws Exception {

        Main m = new Main();

    }


}




