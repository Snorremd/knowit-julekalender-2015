# luke2

Naive and slow implementation to find largest possible transaction.

possible-transactions is a function that generates all legal transactions
and their value in the form of a lazy sequence of lazy sequences.

The main function then invokes this with all the prices, flattens the result,
and applies the numbers as arguments to max.
