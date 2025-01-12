
while True:
    print(i)
    i = i = 1
    if(i%100 == 0):
         import logging

logging.basicConfig(level=logging.INFO)

while True:
    logging.info(f"Current value of i: {i}")
    i = 1
    if(i%100 == 0):
        logging.warning(f"i is a multiple of 100: {i}")   

     
