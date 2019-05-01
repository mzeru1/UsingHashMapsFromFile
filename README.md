**Using HashMaps**


Hashtables/HashMaps are Java objects which contain a collection of  values that can be found by keys. Think  of them as key-value pairs. Because that's exactly what they are. For example, you may have a collection of book objects and identify them by their productID. The ProductID would be the key and the book object would be the value. Using a Hahstable or HashMap you can very quickly retrieve a book by its productID.
Which do I use? Hashtable or HashMap?
Multithreaded applications can do two things at once. They run two process simultaneously. We'll talk about multithreaded applications in more detail later. For now just know that it's possible and developing your application in this way allows it to run long processes concurrently and therefore faster.
Secondly, when you have two threads that are reading and writing to the same 'resource', say a variable named foo, you need to ensure that these threads access the variable in a way that they don't interfere with each other. Without the synchronized keyword, your thread 1 may not see the change thread 2 made to foo, or worse, it may only be half changed. This would not be what you logically expect.
So now that you know what multithreaded applications are and what synchronization is.... you can make an informed choice between using either a Hashtable or a HashMap.
Hashtable (Links to an external site.)Links to an external site. is synchronized, whereas HashMap (Links to an external site.)Links to an external site. is not. This makes HashMap better for non-threaded applications, as unsynchronized Objects typically perform better than synchronized ones.

Hashtable does not allow null keys or values. HashMap allows one null key and any number of null values.

Normally you wouldn't concern yourself with insertion order.  One of HashMap's subclasses is LinkedHashMap (Links to an external site.)Links to an external site., so in the event that you'd want predictable iteration order (which is insertion order by default), you could easily swap out the HashMap for a LinkedHashMap. This wouldn't be as easy if you were using Hashtable.

Link to Slides http://web.stanford.edu/class/archive/cs/cs106a/cs106a.1124/lectures/18/Slides.pdf (Links to an external site.)Links to an external site.
Your Assignment:
Create a map and store integers and their word values.
HashMap<Integer, String> myMap = new HashMap<Integer, String>();
Prompt user to enter a number and print out the word value. 
Example:

Prompt: Enter a number: 10 Response: You entered ten.

If number is not found (use myMap.containsKey(10) then prompt user to tell the map to add that to the map.

Add the key and value to the map with the following line of code:

myMap.put(10,"ten");

Retrieve the value with

String value = myMap.get(10)

Next: Save the values to a file in the format:

10 ten
11 eleven
12 twelve
Then modify your program to load the class and populate the hashmap from the file. That way the user will not have to enter a key/value pair twice.

Use the Scanner.nextInt() and Scanner.next() methods to return values in your file.

            File file = new File();
            scannerInput = new Scanner(file);//note that Scanner can read from a file!
            while (scannerInput.hasNextLine()) {
                String line = scannerInput.nextLine();
                System.out.println(line);
            }
 

One way of iterating through a HashMap....

Map map = new HashMap();

//iterating over keys only
for (Integer key : map.keySet()) {
    System.out.println("Key = " + key);
}

//iterating over values only
for (Integer value : map.values()) {
    System.out.println("Value = " + value);
}
Finally, your program should prompt the user for the value and print out the text.
Program Example:
https://github.com/dave45678/HashmapExample/blob/master/HashmapExample/src/HashmapApp.java (Links to an external site.)Links to an external site.
