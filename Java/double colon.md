# Double colon

*stream*.filter(value -> Screeners.greaterThanFive(value)).*furtherAction*
// is the same as
*stream*.filter(Screeners::greaterThanFive).*furtherAction*
The syntax Screeners::greaterThanFive is saying: "use the static method called greaterThanFive that's in the Screeners class".

