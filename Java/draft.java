

// in main:

# constructor methods
An object is always instantiated by calling a *method that creates an object*, i.e., a constructor by using the "new" keyword.
Account artosAccount = new Account("Arto's account", 100.00);
// in the class:
    public Account (String nameOwner, initialAmount) {
        this.owner = nameOwner;
        this.amount = initialAmount;
    }




// in main

ArrayList<Game> games = new ArrayList<>();

while (fileScanner.HasNextLine)
// split next line into string array
games.add(new Game(firstTeam, secondTeam, firstScore, secondScore));

for (Game teacher: games) {
    System.out.println(teacher);
}
for (String teacher: teachers) {
    System.out.println(teacher);
}



if myTeam.equal(winningTeam) {
gamesWon++;
gamesPlayed++;
}
if myTeam.equal(losingTeam) {
gamesLost++;
gamesPlayed++;
}
