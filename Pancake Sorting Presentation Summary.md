# Pancake Sorting
CMSC 142 G
Presentation Summary
Jan Ithiel S. Merencillo

### A NP-Complete Problem?
There are two things that need to be proven for a problem to be considered NP-complete:
1. It is in NP, that is, the correctness of the problem's solutions can be verified in polynomial time by a Turing machine using a non-deterministic method.
2. It is NP-hard, that is, the problem can be used to simulate every other problem for which it can be verified quickly that a solution is correct.\[[1](https://www.britannica.com/science/NP-complete-problem)\]

Pancake Sorting was proven to be NP-hard by proving that a known lower bound is a tight lower is NP-hard. Simply put, its computational complexity and what it aims to know is a NP-hard problem.\[[2](https://arxiv.org/abs/1111.0434v1)\]

*To see the details of the proof that Pancake Sorting is NP-hard, please refer  to the references below to find the research* Pancake Flipping is Hard *by Laurent Bulteau, Guillaume Fertin, and Irena Rusu.*

### The Pancake Problem
In 1975, Jacob E. Goodman, under the alias Harry Dweighter ("harried waiter"), asked the pancake problem in the American Mathematical Monthly journal. 

The problem is as follows:
*"The chef in our place is sloppy and when he prepares a stack of pancakes they come out all different sizes. Therefore when I deliver them to a customer, on the way to the table I rearrange them (so that the smallest winds up on top and so on, down to the largest at the bottom) by grabbing several from the top and flipping them over, repeating this (varying the number I flip) as many times as necessary. If there are n pancakes, what is the maximum number of flips (as a function a(n) of n) that I will ever have to use to rearrange them?"*\[[3](http://oeis.org/A058986)\]

### Pancake Sorting
From the problem, there are two things to take note of:
1. how the pancakes are being sorted and
2. what the problem is concerned with.

Pancake sorting is used to sort a disordered stack by order of size and is actually sorting by prefix reversals. The idea is to flip the biggest unsorted pancake to the top of the stack then flip the rest of the whole unordered stack to put sort it to the bottom of the stack.

![Example of a Disordered Stack of Seven Pancakes Being Sorted Using Pancake Sort.](https://iq.opengenus.org/content/images/2020/07/pancake_Sort.png)

The problem given by Goodman is interested in the number of flips needed to sort the stack. Thus, the number of flips is concerned with the lower and upper bounds of solving the problem, making the problem computationally complex. Currently, the best improved current bounds given a stack of n pancakes is between $\frac{15}{14}n$ and $\frac{18}{11}n$. This is only theoretical however.

Currently, the known number of minimum flips needed to sort a stack of pancakes is up to only 17 pancakes in the stack while it is undecided whether the minimum number of flips for 18 pancakes is 20 or 21.\[[4](https://www.cs.cmu.edu/~anupamg/251-notes/pancakes.pdf)\]

*If you're interested to see the minimum number of flips required to arrange a stack of 16 pancakes or less, you can check out the link provided by the Online encyclopedia of integer sequences website.*\[[5](http://oeis.org/A058986/b058986.txt)\]

Pancake sorting has a Time Complexity of O($n^{2}$) and a Space Complexity of O($n$).\[[6](https://www.tutorialcup.com/interview/array/pancake-sorting-problem.htm)\]

### Code Demonstration
For the code demonstration of pancake sorting, please refer to the code provided in the **[merencillo-code](https://github.com/210913-CMSC142-G/merencillo-code)** repository in [210913-CMSC142-G](https://github.com/210913-CMSC142-G).

*Please note that the code is **NOT** mine. I only made minor changes to it so that the process of how the array is sorted is visible. Refer to \[[7](https://iq.opengenus.org/pancake-sort/)\] for the source of the code.*


### References
\[1\] [Britannica, T. Editors of Encyclopaedia (2021, June 14). *NP-complete problem. Encyclopedia Britannica.* https://www.britannica.com/science/NP-complete-problem](https://www.britannica.com/science/NP-complete-problem "Reference 1")
\[2\] [Bulteau, L., Fertin, G., & Rusu, I. (2011, November 10). *Pancake Flipping is Hard.* Arxiv. https://arxiv.org/abs/1111.0434v1](https://arxiv.org/abs/1111.0434v1 "Reference 2")
\[3\] [Sloane, N. J. A. (2007, October 12). *Sorting by prefix reversal (or "flipping pancakes"). The On-line Encyclopedia of Integer Sequences.* http://oeis.org/A058986](http://oeis.org/A058986 "Reference 3")
\[4\] [Gupta, A. (2016, September 22). *Notes on Pancakes.* https://www.cs.cmu.edu/~anupamg/251-notes/pancakes.pdf](https://www.cs.cmu.edu/~anupamg/251-notes/pancakes.pdf "Reference 4")
\[5\] [*B-file synthesized from sequence entry. The On-line Encyclopedia of Integer Sequences.* http://oeis.org/A058986/b058986.txt](http://oeis.org/A058986/b058986.txt "Reference 5")
\[6\] [*Pancake sorting problem.* Tutorial Cup. https://www.tutorialcup.com/interview/array/pancake-sorting-problem.htm](https://www.tutorialcup.com/interview/array/pancake-sorting-problem.htm "Reference 6")
\[7\] [Balaji, A. (n.d.). *Pancake sort algorithm (in-place, not stable).* OpenGenus Foundation. https://iq.opengenus.org/pancake-sort/](https://iq.opengenus.org/pancake-sort/ "Reference 7")


