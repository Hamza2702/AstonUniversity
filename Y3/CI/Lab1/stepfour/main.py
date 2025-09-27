import math
import pandas as pd
df = pd.read_csv("ulysses16.csv", sep=",")

def calc_distance():
    for row in df.itertuples(index=False):
        # euclidean distance
        distance = math.sqrt((row.x - row.y) ** 2)
        print(f"Euclidean distance: {distance}")

if __name__ == "__main__":
    calc_distance()
