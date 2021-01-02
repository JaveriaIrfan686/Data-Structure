# CORONO INFORMATION SYSTEM
Corona Information System is created by using java and swing libraries. It is developed by using intelllij IDE.

# Description
Corona Information System ask you to enter name of the country and then scrap that country corona virus record details from a web browser and store data in JTable. Its details include TOTAL CASES, DEATH and RECOVERED number of patients.
It also display scroll pana only when table is full so that more and more data can store in a table. 

# WORKING OF APP:
This is an app which is created for the people who wanted to know the information
regarding corona virus of different countries. 
This app contain a frame inside which is a textfield, search button, and a table.
As you type any character on the text feild it will show you some suggestions.
you can get the desired suggestion by clicking enter.
when you enter the search button.The total number of cases, death and recover will
appear in the table.This app not only shows but also store all the content in the table.

## AUTO COMPLETE TEXT FEILD:
If you type a single character it will start showing suggestion.
And as you specify the word by typing more characters you will get 
your desired suggestion.
Working of autocomplete text feild:
Firtly,we have created an arraylist in which we have stored all the searched countries name.
we have created a method(autocomplete) that takes a string parameter and return void.
In this method, there is loop which will run till the size of the arraylist.
Inside the loop, the condition is applied that whatever we write on the text field 
is similar to what is stored in array then it shoud store that alpha into a string variable.That varible will be stored as last. 
Also there is a start named variable that store length of what is written on the textfield.
As the for loop breaks, there is again a condtion which is used to set the text (country name) on the text field. 


## JTABLE:
Here we have created JTable by having 4 labelled columns as “Country Name”, “Total Cases”, 
“Total Death” and “Total Recovered” which is a array of type "Object[]".
In order to scrap data, we have used “jsoup” library which is built in library in java.


## WORKING OF GETDATA METHOD:
getData():
We have created “getData (String country)” method that accept parameter in which it accept
name of the country about which user want to get corona virus record details. Moreover, this 
method might throw exception. 

"String url = "https://www.worldometers.info/coronavirus/country/" + country + "/";"   

Through url we are calling accessed page on the web browser and passing the name of country 
about which we want record.

  "Document doc = Jsoup.connect(url).get();"

By using jsoup library, we use “connect()” method to create a link and through “get()” method 
it return us complete html code that we used in web scrapping that stored in “Document” that 
comes from Jsoup library in its variable named “doc” which throws IOException.

 "Elements element = doc.select("div#maincounter-wrap");"
  
Then we select specific id to get that data by writing “CSS QUERY”.Here we have used “#” symbol
to specify that we will write any type of id as a css query not any class or any other query
that returns us objects of elements that store in “element” variable.

 "DefaultTableModel m = (DefaultTableModel) table.getModel();" 

To store data in JTable we have used DefaultTableModel from library “javax.swing.table.DefaultTableModel” 
as it uses vector of vector to store data in cells. “getModel()” method returns information on
the current data model during the processing of a personalized reverse engineering. 

 "Vector<String> row = new Vector<>();"

For this we have used Vector of String to store scrap data in to JTable by declearing variable 
named as "row". Initially, row is adding name of being called country in JTable.

"row.add(country);"

 " for (Element element1 : element) { "

Then we run a for each loop in which the objects of elements returned from web stored in “element” variable 
that contain complete html code is passed inside a loop. Where we used "select()" method to 
select css query with label "#div.maincounter" and return its object in a element variable. 

"String text2 = elements.select("spam").text();"

The data return in "element" variable which is in the form of text is stored in "text2" variable
by selecting specific field named as "spam".

"String num = element1.select(".maincounter-number").select("span").text();"

In "num" variable, css query ".maincounter-number" return number of total corona cases, death and recovered. 
Then the data that we have scrapped, stored that data in hash map by passing key and value pair.

## HASH MAP:
" HashMap<String, String> map = new HashMap<String, String>();"

And pass "key" and "value" in insert method of hash map that is "put()" that add up all the data.

"for (Map.Entry map : map.entrySet()) {
                row.add(element1.select(".maincounter-number").text());
}"

while storing elements in a hashmap, it have used two methods in which "Entry" method is used 
to invoked whenever the value in an entry is overwritten by an invocation of put(k,v) for a 
key k that's already in the HashMap. This method is invoked whenever the entry is removed from 
the table.EntrySet() method is used to return a set view of the mapped elements. Now, getValue() and getKey() functions, key-value pairs can be iterated. With that as the elements start to store in a hash Map, on every iteration it also store data in to JTable and show as an output of the program with completet record details.

## JSCROLL PANE:
In addition with that, ther is also "JScrollPane" is added that provides a scrollable view of 
a component. When screen real estate is limited, you can use a scroll pane to display a 
component that is large or one whose size can change dynamically.

# INSTALLATION GUIDE
In order to install this app, all you need to is follow this specific steps:
### STEP1: 
 Click on the "out" option in above given project.
### STEP2: 
 Select "artifacts".
### STEP3: 
 Select "corona_virus_information_system_jar".
 AS YOU CLICK ON THE INSTRUCTION GIVEN IN THE STEP 3, APPLICATION WILL BE INFRONT OF YOU. 

# SUPPORTED OPERATING SYSTEM
It will run smoothing on "WINDOWS"

# REQUIREMENTS FOR INSTALLATION
JDK Platform binary

# MAKING OF .EXE FILE:
(For intellij users)

1- Go to File -> click Project structure
2- Find artifact on the left side of the Project structure.
3- click the plus(+) sign -> jar -> from modules with dependencies
4- Inside the main class section, upload your main class here -> click ok.
5- click apply -> turn on the (include in project build) bullet -> again click apply -> click ok.
6- from the menu bar -> build -> build artifact -> build.
(EXE file is succesfully build inside artifact folder which is inside out folder of your project)
7- if you made any changes in your project, so you can add those changes in your exe file by;
clicking again on build -> build artifact -> rebuild.

# HOW TO FIND SOURCE CODE
Select folder --> corona virus information system --> src --> com/company/myPackage --> Main.java

# VEDIO LINK
https://youtu.be/A9FipkPMdOQ



