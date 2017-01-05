# project_cabal
A competetive tcg with an emphasis on using machine learning to develop a competetive single player experience.

The game has themes of political intrigue, sabotage and espionage within a medieval setting, the core gameplay loop requires development,
but is based around a few primary features.

-each player has two decks, one of resources and one of cards with abilities. when the resources deck runs out a player has lost.

-damage is dealt in the form of dimminishing the opponents resources.

-resources must also be spent to play cards in order to interact with the opponent, therefore all actions cause the player to lose life and picking the most efficient response that will deal the least damage to that player is the main learning curve.

At this point all the ratios for how decks and stockpiles (decks of resources) are valued and what the cards impacts are are in development. initial designs are as follows.

one resource type: wealth. Stockpiles contain 30 cards.

Decks contain two card types, citizens and plots.

citizens have a cost and a power, plots have a cost and an ability.
