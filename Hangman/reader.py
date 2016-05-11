import sys
#short and ugly script to strip the weird formatting I got from my text files.
path = sys.argv[1]
file_name = sys.argv[2]
x = open(path, "r")
lines = x.read()
print lines
x.close()
x = open(file_name,"wb")
for line in lines:
   if len(line) == 0:
	continue
   elif "-" in line:
	continue
   else:
	line.replace("\n","")
	x.write(line)
x.close()

