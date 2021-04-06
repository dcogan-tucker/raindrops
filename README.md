# raindrops

## Introduction

An application that takes in an integer and returns a string constructed based on the integer's factors. The rules are as follows:

* 3 is a factor, append '**Pling**'
* 5 is a factor, append '**Plang**'
* 7 is a factor, append '**Plong**'
* None of the above factors, append the integer as a string.

### Examples

Some examples of inputs and the expected outputs.

|Input |Factors |Output |
--- | --- | ---
|9|1, 3, 9|Pling|
|10|1, 2, 5, 10|Plang|
|28|1, 2, 4, 7, 14, 28|Plong|
|45|1, 3, 5, 15, 45|PlingPlnag|
|63|1, 3, 7, 9, 21, 63|PlingPlong|
|105|1, 3, 5, 7, 15, 21, 35, 105|PlingPlangPlong|
|107|1, 107|107|
