#	Lottery game (Console)
####	- Remake of Python lottery game

###	Steps:
	1. User chooses to generate 8 numbers (Lotto draw numbers).
	2. Generate 8 random numbers (Lotto balls).
	3. Match lotto draw numbers to lotto balls.
	4. Use case for matching lotto draw numbers to lotto balls:
		- Match 0, 1 and 2, do nothing.
		- Match Only 3, User wins R500.
		- Match Only 4, User wins R1_500.
		- Match Only 5, User wins R2_500.
		- Match Only 6, User wins R5_000.
		- Match Only 7, User wins R10_000.
		- Match All 8, User wins R20_000.
	5. Export results to txt file.
	6. Display results to console.
	
	
#####	Tree src/:
			+ src
			|--- module-info.java (current)
			|	+ lotteryTicket (module)
			|				  |---LottoGenerator.java
			|				  |---Main.java
