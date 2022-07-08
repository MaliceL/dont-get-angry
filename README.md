# Mensch Ärger dich nicht

[TODO]: # (Change README.md Headline to better fit to your project!)

This repository contains a student project created for an ongoing lecture on object-oriented programming with Java at HWR Berlin (summer term 2022).

> :warning: This code is for educational purpose only. Do not rely on it!

## Abstract

Das Spiel ist Mensch Ärger dich nicht.
Alle zum Spiel notwendigen Funktionen sind vorhanden.
Wichtige Funktionen:
- Erstellung der Spielumgebung, inklusive 4 Spieler mit jeweils 4 Figuren
- Figuren können aufs Feld gestellt oder entfernt werden
- Felder wissen ob und von wem sie besetzt sind
- Zielfelder (Häuser)

## Feature List

| Number | Feature             | Tests                                                                                                                                                              |
|--------|---------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1      | Spielbrett erstellen | getPositionAtIndex38                                                                                                                                               |
| 2      | Figur bewegen       | createTeamMoveFigureTwoFrom0To5<br/>createTeamBlueRemoveFigureAndCheckOnField<br/>createTeamRedMoveFigureOverField39Threshhold<br/>createTeamBlueMoveFigureInHouse |
| 3      | Figur schlagen      | createRedBlueStrikeScenario                                                                                                                                        |
| 4      | Siegszenarien       | teamgreenWins<br/>teamblueWins<br/>teamredWins<br/>teamyellowWins<br/>nobodyWins                                                                                   |
| 5      | Würfel              | roll_numbersMatchSeed<br/>roll_randomNumbersAreBetween1And6<br/>rollUntilSixMaxThree_returnTrue<br/>rollUntilSixMaxThree_returnsFalse                                                                                                                                                                   |


## Additional Dependencies

[TODO]: # (For each additional dependency your project requires- Add an additional row to the table!)

| Number | Dependency Name | Dependency Description | Why is it necessary? |
|--------|-----------------|------------------------|----------------------|
| 1      | /               | /                      | /                    |

