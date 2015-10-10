# linearModelImageCompression Overview

This project compresses a 256x256 image of a circle into a set of parameters for a linear model with two factors representing the coordinates within the image and numerous polynomial transformations of those coordinates.

Ignoring formatting single logical lines of code into multiple actual lines of code for readability, the decompressor is five lines of actual Java code and the compressor is 18 lines of R code.  I considered doing the decompressor in Clojure, but considered it cheating as the whole program could likely be done in a single line of code.

# Why?

I wanted to see how good (bad?) a linear model would work for representing an image.  Originally I was hopeful that I could use a First Hand Foundation related image in the spirit of the contest, but the performance of a linear model in this application isn't good enough for any significant detail, and the rendered image was unrecognizable.

The model actually does a fairly poor job of even representing a simple circle, but hopefully it demonstrates the wide applicability of machine-learning techniques and gives a sense of how real image compression algorithms can work.

# How does it work?

For those not familiar with machine learning; the easiest way of thinking about a linear model is that it is fitting an equation to a set of data (the "features") by an automated "trial and error" algorithm.  It is called a "linear" model because at its core, it is fitting a line to a set of data, but the use of polynomial terms allows a linear model to fit to non-linear data.

