# NumberFormatException in Scala Auxiliary Constructor
This example demonstrates a common error related to auxiliary constructors in Scala.  When converting a String to an Int within an auxiliary constructor, improper handling of potential exceptions can lead to a `NumberFormatException`. The solution involves using a `try-catch` block to gracefully handle the conversion failure.

## How to Reproduce
1. Create a file named `Bug.scala` and paste the code into it.
2. Compile and run the code using `scalac Bug.scala` and `scala Bug`. 
3. Observe that the program crashes with a `NumberFormatException`.

## Solution
The `BugSolution.scala` file provides a solution that includes error handling.

## Additional Notes
This issue highlights the importance of careful exception handling when performing type conversions, particularly in scenarios involving user input or data from external sources.
