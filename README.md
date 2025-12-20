# kotlin-programming


## First: reality check (don’t skip this)

**“Master Kotlin by Spring 2026”** is *plausible*, but only if:

* You **write code daily** (not watch tutorials).
* You **build real programs**, not just solve toy problems.
* You **understand the JVM + concurrency + architecture**, not just Kotlin syntax.

If you only grind algorithmic problems, you’ll become *leetcode-competent*, not *Kotlin-proficient*. Kotlin mastery requires:

* Type system fluency
* Coroutines & structured concurrency
* JVM internals & performance trade-offs
* Tooling (Gradle, testing, debugging)
* At least one **production-grade project**

So I’ll give you **100 problems**, but **structured**, escalating, and intentionally uncomfortable.

---

# 100 Kotlin Problem-Solving Programs (No fluff)

## LEVEL 1 — Kotlin Core & Thinking in Expressions (1–20)

If you struggle here, you’re not ready for real Kotlin.

1. Reverse a string **without** using built-in reverse
2. Count vowels using functional style
3. Check palindrome ignoring case and spaces
4. Find max & min in IntArray without `max()`/`min()`
5. Implement factorial **recursively and iteratively**
6. Fibonacci with memoization
7. Swap two numbers without temp variable
8. Count frequency of characters in a string
9. Remove duplicates from a list (preserve order)
10. Find first non-repeating character
11. Sum of digits of a number
12. Check prime (optimize beyond O(n))
13. Generate all primes up to N (Sieve)
14. Merge two sorted arrays
15. Find missing number in `1..n`
16. Rotate array by K positions
17. Find second largest element
18. Check if two strings are anagrams
19. Count words in a sentence
20. Convert decimal to binary manually

👉 **Hidden lesson**: immutability, loops vs expressions, `when`, null-safety basics.

---

## LEVEL 2 — Collections, Lambdas, and Idiomatic Kotlin (21–40)

If your solutions look like Java, you’re doing it wrong.

21. Group words by length
22. Find top K frequent elements
23. Flatten a list of lists
24. Implement `map`, `filter`, `reduce` manually
25. Sort objects by multiple fields
26. Find intersection of two lists
27. Partition list into even/odd
28. Count occurrences using `groupingBy`
29. Remove nulls safely from list
30. Build frequency histogram
31. Custom comparator for strings (by vowel count)
32. Find longest word in a sentence
33. Chunk list into fixed-size sublists
34. Sliding window max sum
35. Find subarray with given sum
36. Rotate string by K
37. Convert list to map with conflict resolution
38. Check if list is monotonic
39. Generate permutations (small N)
40. Generate subsets (power set)

👉 **Hidden lesson**: higher-order functions, performance trade-offs, readability vs control.

---

## LEVEL 3 — Data Classes, Sealed Classes, OOP vs FP (41–55)

This is where Kotlin starts to matter.

41. Model a bank account system
42. Implement sealed class for API result
43. Custom `equals` & `hashCode`
44. Build immutable stack
45. Build immutable queue
46. Expression evaluator using sealed classes
47. Serialize/deserialize simple objects (no libraries)
48. Strategy pattern using lambdas
49. Observer pattern using flows (later coroutines)
50. State machine using sealed classes
51. Compare inheritance vs composition
52. Design calculator with extensibility
53. Build a command parser
54. LRU cache implementation
55. Rate limiter logic

👉 **Hidden lesson**: Kotlin is not “Java with better syntax.” Architecture matters.

---

## LEVEL 4 — Recursion, Trees, Graphs (56–70)

If you avoid this, you cap your ceiling.

56. Binary tree traversal (all orders)
57. Check if tree is balanced
58. Lowest common ancestor
59. Serialize/deserialize binary tree
60. Graph DFS & BFS
61. Detect cycle in graph
62. Shortest path (BFS / Dijkstra)
63. Trie implementation
64. Word search in grid
65. Maze solver
66. Flood fill
67. N-Queens
68. Sudoku solver
69. Topological sort
70. Evaluate expression tree

👉 **Hidden lesson**: recursion depth, stack vs heap, algorithmic complexity.

---

## LEVEL 5 — Coroutines & Concurrency (71–85)

Most “Kotlin devs” fail here.

71. Launch concurrent tasks and aggregate results
72. Producer–consumer using channels
73. Implement retry with exponential backoff
74. Timeout wrapper for suspend functions
75. Parallel map with coroutines
76. Cancel propagation demo
77. Rate-limited API caller
78. Coroutine-based pipeline
79. Concurrent cache with Mutex
80. Fan-out / fan-in pattern
81. Async file downloader (mock)
82. Coroutine exception handling demo
83. Structured vs unstructured concurrency comparison
84. Build simple task scheduler
85. Flow vs Channel comparison demo

👉 **Hidden lesson**: correctness > speed. Concurrency bugs ruin careers.

---

## LEVEL 6 — Real-World Systems (86–100)

These separate hobbyists from professionals.

86. CLI todo app (file persistence)
87. REST client (mocked API)
88. JSON parser (subset)
89. Log file analyzer
90. Plugin system using interfaces
91. Simple build tool simulation
92. Dependency injection mini-framework
93. Configuration loader with validation
94. Markdown to HTML converter (subset)
95. Search engine (in-memory)
96. Chat server simulation
97. Versioned data storage
98. Mini database (key-value)
99. Rule engine
100. **One original project** (your idea, not copied)

👉 **Hidden lesson**: trade-offs, testing, maintainability, performance.

---

## Assumptions you might be making (I’m challenging them)

* ❌ “100 problems = mastery” → **False**
* ❌ “Algorithms alone are enough” → **False**
* ❌ “Kotlin is easy” → **Dangerously false**
* ❌ “Spring 2026 is far away” → It’s not.

---

## Non-negotiable rules if you’re serious

1. **No copy-paste**
2. **Write tests** (even basic ones)
3. **Refactor old solutions**
4. **Explain your solution out loud**
5. **Build at least 2 real projects**

---

## My challenge to you

Pick **Problem #1** and solve it in Kotlin **idiomatically**.
Post your solution here. I will:

* Tear it apart
* Point out inefficiencies
* Suggest better alternatives
* Push you harder

If you want comfort, stop now.
If you want mastery, start coding.
