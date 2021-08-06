
dlist = [31,28,31,30,31,30,31,31,30,31,30,31];
totalcount = 0;
sundaycount = 0;

for y in range(1901, 2001):
  for m in range(12):
    day = dlist[m]
    if y % 4 == 0 and m == 1:
      day += 1
    for d in range(day):      
      if totalcount % 7 == 6 and d == 1:
        sundaycount += 1;
      totalcount += 1

print(sundaycount)
print(totalcount)