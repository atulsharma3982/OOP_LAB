import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv("student_data.csv")

print(data[["Study_Hours","Marks"]].describe())

plt.figure(figsize=(10,6))

plt.scatter(data["Study_Hours"][:20],
            data["Marks"][:20],
            marker='o',
            s=120,
            color='red',
            label='Circle')

plt.scatter(data["Study_Hours"][20:40],
            data["Marks"][20:40],
            marker='s',
            s=120,
            color='blue',
            label='Square')

plt.scatter(data["Study_Hours"][40:60],
            data["Marks"][40:60],
            marker='^',
            s=120,
            color='green',
            label='Triange')

plt.scatter(data["Study_Hours"][60:80],
            data["Marks"][60:80],
            marker='D',
            s=120,
            color='orange',
            label='Diamond')

plt.scatter(data["Study_Hours"][80:100],
            data["Marks"][80:100],
            marker='*',
            s=120,
            color='purple',
            label='Star')

plt.title("Scatter Plot using Different Marker Styles", fontsize=16, fontweight="bold")

plt.xlabel("Study Hours",fontsize=13)
plt.ylabel("Marks",fontsize=13)

plt.xlim(0,10)
plt.ylim(20,100)

plt.legend(loc="upper left")

plt.grid(True, linestyle='--',linewidth=0.8, alpha=0.5)

plt.savefig("MarkerStyles.pdf")
plt.savefig("MarkerStyles.png")

plt.show()