# Complex Data Structure

### Data Structure

The following code is used to read CSV files. The BufferedReader class has been used. It is recommended to use Scanner if you want to analyze a specific type of token from a stream, and BufferedReader if you want to read large strings from a stream. Unbuffered streams are not synchronous; buffered streams are. This means that when using buffered streams, multiple threads can be active at the same time. 

#### Reading customers data

![](https://i.imgur.com/GATFGrM.png)

#### Reading packages data

![](https://i.imgur.com/C5wA0Fp.png)

#### Parsing data

Converts the string split using the delimeter by parsing it into the appropriate types finally creating a Customer or Package object

![](https://i.imgur.com/UBe4UKR.png)

#### Binary search

Binary search uses the divide and conquer strategy, in which the listing is split into two halves and the item is compared to the listing's middle detail. If a match is made, the middle element's position, or the element, is returned. 

With a temporal complexity of O, binary search is a rapid search method (log n). The elements need to be arranged in either ascending or descending order for the method to function correctly. 

Because the Binary Search Tree has ordered properties, it conducts element deletion, insertion, and searching faster. 
The code is used to search for a package or customer by ID number.

![](https://i.imgur.com/gDgaL0I.png)
  
#### Linear search

One of the most straightforward ways to locate a certain piece inside a data set is using linear search. Each piece of data is reviewed until a match is found, at which point the check cycle repeats until all of the data has been checked. If it discovers a match, the algorithm will cease looking. 

The code is used to search for a package or customer by ID number.

![](https://i.imgur.com/Zeuwl5F.png)

#### Tests

![](https://i.imgur.com/76G9qI2.png)

### Sorting 

#### Bubble sort

A straightforward sorting method known as bubble sort, also known as sinking sort, compares each element in turn with the one after it in the input list and, if necessary, swaps their values. The list is iterated through several times until no swaps are required at any one pass, at which point the list is considered fully sorted. The larger entries "bubble" up to the top of the list in the method, which is a comparison sort.

The following code is used to sort Customers and packages by their unique ID. 

![](https://i.imgur.com/ZgTtksK.png)

#### Selection sort

The in-place comparison sorting method known as selection sort is used in computer science. It performs less well than the comparable insertion sort in general and is inefficient on large lists due to its O(n2) time complexity. In some circumstances, especially when auxiliary memory is constrained, selection sort—known for its simplicity—performs better than more complex algorithms.

The algorithm separates the input list into two parts: a sublist of the remaining unsorted items that fills the remaining space in the list, and a sublist of the sorted items that are built up from left to right at the beginning (left) of the list. The input list is the complete unsorted sublist at first, while the sorted sublist is initially empty. The next step in the procedure is to locate the smallest (or largest, depending on the sorting order) element in the unsorted sublist, swap it with the element immediately to its left to sort it, and then move the sublist borders one element to the right.

The following code is used to sort Customers and packages by their unique ID. 

![](https://i.imgur.com/pZ8k7Cb.png)

#### Insertion sort

The straightforward sorting algorithm known as insertion sort functions similarly to how you would arrange playing cards in your hands. In a sense, the array is divided into sorted and unsorted parts. Values are chosen and assigned to the appropriate positions in the sorted part of the data from the unsorted part.

The following code is used to sort Customers and packages by their unique ID. 

![](https://i.imgur.com/zW7Jen3.png)

#### Merge sort

Merge sort is one of the most efficient sorting algorithms. It is based on the divide-and-conquer strategy. Merge sort continuously cuts down a list into multiple sublists until each has only one item, then merges those sublists into a sorted list.

The following code is used to sort Customers and packages by their unique ID. 

![](https://i.imgur.com/OpebyHR.png)

#### Quick sort

Divide-and-conquer is an algorithm used in quicksort. It operates by choosing a "pivot" element from the array and dividing the other elements into two sub-arrays based on whether they are greater or less than the pivot. This is why it is occasionally referred to as partition-exchange sort. The sub-arrays are then recursively sorted. This may be done in-place and just needs a little bit of extra memory to sort the data.

Due to the fact that Quicksort is a comparison sort, it can organize items of any type for which a "less-than" relation (officially, a total order) is defined. Since Quicksort is not a stable sort, the relative order of equal sort items is not maintained in efficient implementations of Quicksort.

The following code is used to sort Customers and packages by their unique ID. 

![](https://i.imgur.com/MWm6gaX.png)

#### Tests

![](https://i.imgur.com/Jp7chmd.png)

### HashMap

The HashMap in a linear data structure 

A common and effective storage structure for storing data that can be searched in constant time O (1). It is also known as a hash table. The array used to build this data structure translates keys to values. So, a hash map can be thought of as a collection of key-value pairs. Each key is an integer produced by a hash function that ranges from 0 to the array size minus 1. 

The packages are a good hash map illustration. Names and package IDs are listed in a file. The names in this instance serve as the keys, and the package Id serve as the values. If you had a billion integers, using a linear search technique would take months, whereas utilizing a hash map would just take a second. 

![](https://i.imgur.com/DB85KSz.png)

#### Tests

![](https://i.imgur.com/ezgxFon.png)

### Binary tree

The tree keeps records of all the packages, height and sorts them according to their height from the smallest to the biggest 

A nonlinear data structure called a BINARY TREE allows each node to have a maximum of two child nodes. 

The speed of deletion, insertion, and searching operations in Binary Tree is slower as compared to Binary Search Tree because it is unordered.   

Binary tree node with generic type

#### Node

The tree keeps records of all the packages, height and sorts them according to their height from the smallest to the biggest 

A nonlinear data structure called a BINARY TREE allows each node to have a maximum of two child nodes. 

The speed of deletion, insertion, and searching operations in Binary Tree is slower as compared to Binary Search Tree because it is unordered.   

Binary tree node with generic type 

![](https://i.imgur.com/vzBHiNo.png)

![](https://i.imgur.com/SYegP3W.png)

### Tests

![](https://i.imgur.com/B3t1CZy.png)


### Graph Structure

The graphs will store the address for the delivery locations.

![](https://i.imgur.com/hQ31Eex.png)

![](https://i.imgur.com/pwvNej1.png)

### Backtracking

Backtracking is an algorithmic technique where the objective is to find every possible solution to a problem by applying a brute force strategy. It entails gradually compiling an entire collection of all possible solutions. Since a problem would have limits, the solutions won't be retained if they don't meet the requirements. 

By creating a solution piece by piece and adding levels over time, it uses recursive calling to identify a solution set. State-space tree is a search tree that is used to locate these answers. Each branch in a state-space tree corresponds to a variable, and each level stands for a potential solution. 

Depth-first search is applied in a backtracking algorithm. A boundary function is used when the algorithm first begins exploring solutions so that it may verify that the solutions it has created thus far satisfy the restrictions. If so, it carries on looking. If not, the branch would be deleted, and the algorithm would return to the previous level. 

![](https://i.imgur.com/xbs5lir.png)

### Tests

![](https://i.imgur.com/ajerdAM.png)

### Heaps & Heapsort

Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning. Repeat the same process for the remaining elements.

A comparison-based sorting method based on the Binary Heap data structure is called heap sort. It is comparable to the selection sort in which the minimum element is initially located and placed at the start. For the remaining components, follow the same procedure. 

![](https://i.imgur.com/v3V7WcX.png)

## References

- Wikipedia contributors. (2022, September 9). Bubble sort. Wikipedia. https://en.wikipedia.org/wiki/Bubble_sort
- Wikipedia contributors. (2022, September 25). Selection sort. Wikipedia. https://en.wikipedia.org/wiki/Selection_sort
- GeeksforGeeks. (2022, October 18). Insertion Sort. https://www.geeksforgeeks.org/insertion-sort/
- Khandelwal, V. (2021, October 27). What is Merge Sort Algorithm: How does it work, its Advantages and Disadvantages. Simplilearn.com. https://www.simplilearn.com/tutorials/data-structure-tutorial/merge-sort-algorithm
- Wikipedia contributors. (2022d, November 6). Quicksort. Wikipedia. https://en.wikipedia.org/wiki/Quicksort
- Aggarwal, Shivi, and Ameya Gharpure. “Heap Sort.” GeeksforGeeks, GeeksforGeeks, 22 Sept. 2022, https://www.geeksforgeeks.org/heap-sort/.  
- Java. “Linear Search - Javatpoint.” Www.javatpoint.com, JavaPoint, 3 Sept. 2011, https://www.javatpoint.com/linear-search.  
- Pankaj, Pankaj. “Java HashMap - HashMap in Java.” DigitalOcean, DigitalOcean, 3 Aug. 2022, https://www.digitalocean.com/community/tutorials/java-hashmap.  
- Sharma, Elite, director. Java - Built My Own ArrayList Using Array. YouTube, YouTube, 6 Jan. 2021, https://www.youtube.com/watch?v=y-ND8rzO3LM. Accessed 5 Nov. 2022.  
- Verma, Jayant. “Breadth-First Search (BFS) and Depth-First Search (DFS) for Binary Trees in Java.” DigitalOcean, DigitalOcean, 3 Aug. 2022, https://www.digitalocean.com/community/tutorials/breadth-first-search-depth-first-search-bfs-dfs.  
- Willains, Jenana. “BFS with Backtracing with Code Examples.” Programming and Tools Blog -, FolksTalk, 2 Oct. 2022, https://www.folkstalk.com/2022/10/bfs-with-backtracing-with-code-examples.html. 
- GeeksforGeeks. (2022a, September 22). Heap Sort. https://www.geeksforgeeks.org/heap-sort/