# R script to create the linear model and generate the function for the Java component of 
# the submission.  

# Requires package png
library(png)
library(arrayhelpers)
# Set the working directory to the script directory so the image can be found.
setwd(getSrcDirectory(function(x) {x}))
png <- readPNG("circle-256.png")
myarray = array(dim=c(256,256))
# Transform the PNG into an array
for( x in 1:256) {
  for( y in 1:256) {
    # This image happens to use alpha for the background.  The less-than condition 
    # is a hold-over from earlier iterations of the script that I left because it works well.
    myarray[x,y] <-  if(png[x,y,4] < 0.95) 0 else 1;
  }
}
# Flatten the array into a data frame with the value of the pixel and the two coordinates as columns
dat2 <-array2df(myarray)
# Fit the model. Again, formatting the single line of code as multiple lines to keep it readable
fit <- lm(myarray ~ 
            d1 + 
            d2 + 
            I(d1**2) +
            I(d2**2) +
            I(d1**3) +
            I(d2**3) +
            I(d1**4) +
            I(d2**4) +
            I(d1**5) +
            I(d2**5) +
            I(d1**6) +
            I(d2**6) +
            I(d1**7) +
            I(d2**7) +
            I(d1**8) +
            I(d2**8) +
            I(d1**9) +
            I(d2**9) +
            I(d1**10) +
            I(d2**10) +
            I(d1**11) +
            I(d2**11) +
            I(d1**12) +
            I(d2**12) +
            I(d1**13) +
            I(d2**13) +
            I(d1**14) +
            I(d2**14) +
            I(d1**15) +
            I(d2**15) +
            I(d1**16) +
            I(d2**16) +
            I(d1**17) +
            I(d2**17) +
            I(d1**18) +
            I(d2**18) +
            I(d1**19) +
            I(d2**19) +
            I(d1**20) +
            I(d2**20) +
            I(d1**21) +
            I(d2**21) +
            I(d1**22) +
            I(d2**22) +
            I(d1**23) +
            I(d2**23) +
            I(d1**24) +
            I(d2**24) +
            I(d1**25) +
            I(d2**25) +
            I(d1**26) +
            I(d2**26) +
            I(d1**27) +
            I(d2**27) +
            I(d1**28) +
            I(d2**28) +
            I(d1**29) +
            I(d2**29) +
            I(d1**30) +
            I(d2**30) +
            I(d1**31) +
            I(d2**31) +
            I(d1**32) +
            I(d2**32) +
            I(d1**33) +
            I(d2**33) +
            I(d1**34) +
            I(d2**34) +
            I(d1**35) +
            I(d2**35) +
            I(d1**36) +
            I(d2**36) +
            I(d1**37) +
            I(d2**37) +
            I(d1**38) +
            I(d2**38) +
            I(d1**39) +
            I(d2**39) +
            I(d1**40) +
            I(d2**40) +
            I(d1**41) +
            I(d2**41) +
            I(d1**42) +
            I(d2**42) +
            I(d1**43) +
            I(d2**43) +
            I(d1**44) +
            I(d2**44) +
            I(d1**45) +
            I(d2**45) +
            I(d1**46) +
            I(d2**46) +
            I(d1**47) +
            I(d2**47) +
            I(d1**48) +
            I(d2**48) +
            I(d1**49) +
            I(d2**49) +
            I(d1**50) +
            I(d2**50) +
            I(d1**51) +
            I(d2**51) +
            I(d1**52) +
            I(d2**52) +
            I(d1**53) +
            I(d2**53) +
            I(d1**54) +
            I(d2**54) +
            I(d1**55) +
            I(d2**55) +
            I(d1**56) +
            I(d2**56) +
            I(d1**57) +
            I(d2**57) +
            I(d1**58) +
            I(d2**58) +
            I(d1**59) +
            I(d2**59) +
            I(d1**60) +
            I(d2**60) +
            I(d1**61) +
            I(d2**61) +
            I(d1**62) +
            I(d2**62) +
            I(d1**63) +
            I(d2**63) +
            I(d1**64) +
            I(d2**64) +
            I(d1**65) +
            I(d2**65) +
            I(d1**66) +
            I(d2**66) +
            I(d1**67) +
            I(d2**67) +
            I(d1**68) +
            I(d2**68) +
            I(d1**69) +
            I(d2**69) +
            I(d1**70) +
            I(d2**70) +
            I(d1**71) +
            I(d2**71) +
            I(d1**72) +
            I(d2**72) +
            I(d1**73) +
            I(d2**73) +
            I(d1**74) +
            I(d2**74) +
            I(d1**75) +
            I(d2**75) +
            I(d1**76) +
            I(d2**76) +
            I(d1**77) +
            I(d2**77) +
            I(d1**78) +
            I(d2**78) +
            I(d1**79) +
            I(d2**79) +
            I(d1**80) +
            I(d2**80) +
            I(d1**81) +
            I(d2**81) +
            I(d1**82) +
            I(d2**82) +
            I(d1**83) +
            I(d2**83) +
            I(d1**84) +
            I(d2**84) +
            I(d1**85) +
            I(d2**85) +
            I(d1**86) +
            I(d2**86) +
            I(d1**87) +
            I(d2**87) +
            I(d1**88) +
            I(d2**88) +
            I(d1**89) +
            I(d2**89) +
            I(d1**90) +
            I(d2**90) +
            I(d1**91) +
            I(d2**91) +
            I(d1**92) +
            I(d2**92) +
            I(d1**93) +
            I(d2**93) +
            I(d1**94) +
            I(d2**94) +
            I(d1**95) +
            I(d2**95) +
            I(d1**96) +
            I(d2**96) +
            I(d1**97) +
            I(d2**97) +
            I(d1**98) +
            I(d2**98) +
            I(d1**99) +
            I(d2**99)   
            ,data=dat2)

cof <- coefficients(fit)
str <- paste0("double v = ",cof[[1]], " + \n")
for(i in seq(2,length(names(cof)),by=2)) {
  power <- i / 2;
  if(!is.na(cof[[i]]))   str <- paste0(str, "Math.pow(d1,", power, ") * Double.parseDouble(\"", cof[[i  ]], "\") + \n")
  if(!is.na(cof[[i+1]])) str <- paste0(str, "Math.pow(d2,", power, ") * Double.parseDouble(\"", cof[[i+1]], "\") + \n")
}
# Print the coefficients to manually verify against the generated code.
print(cof)
cat(str)