# 03-Collections - Java Collections Framework Learning

This folder contains refactored and cleaned Java programs demonstrating the Collections Framework.

## 📚 Collection Types & Demonstrations

### List Implementations
- **ArrayListDemo.java** - Dynamic array-based list implementation
  - Adding, inserting, merging lists
  - Type safety with generics
  
- **LinkedListDemo.java** - Doubly-linked list implementation
  - O(1) insertion/deletion at both ends
  - Sequential access patterns
  
- **ArrayDequeDemo.java** - Double-ended queue (deque)
  - Add/remove from both front and back
  - More efficient than LinkedList for Queue/Deque operations

### Set Implementations
- **HashSetDemo.java** - Hash table based set with insertion order preservation
  - No duplicates
  - Uses LinkedHashSet for maintaining insertion order
  - O(1) average case operations

- **TreeSetDemo.java** - Sorted set using Red-Black Tree
  - Maintains elements in sorted order
  - No duplicates
  - Navigation methods (higher, lower, ceiling, floor)

### Queue Implementation
- **PriorityQueueDemo.java** - Min-heap priority queue
  - Elements ordered by priority
  - Common use case: task scheduling, Dijkstra's algorithm
  - Peek, poll, and offer operations

### Legacy Collections
- **VectorAccessDemo.java** - Thread-safe list and access patterns
  - Vector: Legacy synchronized collection
  - CopyOnWriteArrayList: Fail-safe iteration
  - Iterator vs Enumeration (legacy)

## 🎯 Sorting & Comparison

### Custom Sorting with Comparator
- **ComparatorDemo.java** - External sorting logic
  - Sort by different attributes dynamically
  - Lambda expressions and method references
  - Multiple sorting strategies in one program

### Natural Sorting with Comparable
- **ComparableDemo.java** - Implementing natural order
  - Implement Comparable interface
  - compareTo() method defines sorting logic
  - Single natural order per class

## 🛠️ Type Safety & Utilities

- **CollectionsGenericDemo.java** - Generics for type safety
  - ArrayList<T> prevents ClassCastException
  - Compile-time type checking
  
- **CollectionsSortingDemo.java** - Collections utility class
  - Sorting lists
  - Frequency counting
  - Shuffling collections

## 🚀 How to Run

### Compile all files
```bash
javac *.java
```

### Run individual demos
```bash
java ArrayListDemo
java ComparatorDemo
java TreeSetDemo
java VectorAccessDemo
```

## 📊 Collection Performance Comparison

| Collection | Search | Insert | Delete | Order | Notes |
|-----------|--------|--------|--------|-------|-------|
| ArrayList | O(1) | O(n) | O(n) | Insertion | Fast random access |
| LinkedList | O(n) | O(1)* | O(1)* | Insertion | Fast at ends only |
| HashSet | O(1)** | O(1)** | O(1)** | None | No duplicates |
| TreeSet | O(log n) | O(log n) | O(log n) | Sorted | Maintains order |
| PriorityQueue | O(1)*** | O(log n) | O(log n) | Priority | Heap-based |

*O(1) only at ends; **Average case; ***O(log n) for priority update

## 🔑 Key Concepts Covered

1. **Type Safety** - Using generics to prevent type errors
2. **Iteration** - Iterator, for-each, ListIterator, Enumeration
3. **Sorting** - Comparable vs Comparator
4. **Hashing** - HashSet and internal hashing
5. **Tree-based Collections** - Binary Search Tree, Red-Black Tree
6. **Thread Safety** - Vector, CopyOnWriteArrayList, synchronized wrappers
7. **Queue Operations** - FIFO (Queue), LIFO (Stack), Priority (PriorityQueue)

## 📝 Refactoring Summary

**What was changed:**
- Unified 19 redundant/duplicate files into 11 clean, well-organized files
- Replaced "Telusko" with "Learning" for professionalism
- Renamed files to match class names (fixed typos like "LuanhcLinkedList")
- Removed commented-out code and unnecessary complexity
- Added comprehensive JavaDoc comments
- Improved code structure and readability
- Consolidated similar examples into single, clear demonstrations

**Files merged:**
- LaunchArrayList + ArrayList1 → ArrayListDemo
- LaunchArrayDeque + ArrayDeque1 → ArrayDequeDemo
- LaunchHash + Hash → HashSetDemo
- LuanhcLinkedList + LinkedList1 → LinkedListDemo
- LaunchPQ + PQ + PriorityQueue2 → PriorityQueueDemo
- LaunchTreeSet + TreeSet1 → TreeSetDemo
- LaunchAccessData + AccessData → VectorAccessDemo
- LaunchCollctions (typo) → CollectionsGenericDemo
- LaunchCollections1 → CollectionsSortingDemo
- LaunchComplex1 → ComparatorDemo
- LaunchComplex2 → ComparableDemo

---

✅ All files compiled and tested successfully!
