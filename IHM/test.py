import matplotlib.pyplot as plt
from matplotlib.patches import Rectangle

def draw_text(ax, x, y, text, fontsize=10, ha='center', va='center'):
    ax.text(x, y, text, ha=ha, va=va, fontsize=fontsize, color='black', bbox=dict(facecolor='white', edgecolor='black', boxstyle='round,pad=0.5'))

fig, ax = plt.subplots(figsize=(10, 8))

# Top Section (Création d'un Spectacle et de ses Tarifs)
draw_text(ax, 0.5, 0.9, "Création d'un Spectacle", fontsize=12, ha='center', va='center')
draw_text(ax, 0.25, 0.85, "Nom du Spectacle:", fontsize=10, ha='center', va='center')
draw_text(ax, 0.75, 0.85, "TextField", fontsize=10, ha='center', va='center')
draw_text(ax, 0.25, 0.80, "Tarif:", fontsize=10, ha='center', va='center')
draw_text(ax, 0.75, 0.80, "TextField", fontsize=10, ha='center', va='center')
draw_text(ax, 0.5, 0.75, "Button: Créer Spectacle", fontsize=10, ha='center', va='center')

# Left Section (Création de Représentations)
draw_text(ax, 0.15, 0.60, "Création d'une Représentation", fontsize=12, ha='center', va='center')
draw_text(ax, 0.10, 0.55, "Nom du Spectacle:", fontsize=10, ha='center', va='center')
draw_text(ax, 0.25, 0.55, "ChoiceBox", fontsize=10, ha='center', va='center')
draw_text(ax, 0.10, 0.50, "Date:", fontsize=10, ha='center', va='center')
draw_text(ax, 0.25, 0.50, "TextField", fontsize=10, ha='center', va='center')
draw_text(ax, 0.15, 0.45, "Button: Créer Représentation", fontsize=10, ha='center', va='center')

# Center Section (Tableau des Statistiques)
draw_text(ax, 0.5, 0.35, "Statistiques des Spectacles", fontsize=12, ha='center', va='center')
draw_text(ax, 0.25, 0.30, "Filtrer par:", fontsize=10, ha='center', va='center')
draw_text(ax, 0.50, 0.30, "ChoiceBox", fontsize=10, ha='center', va='center')
draw_text(ax, 0.70, 0.30, "TextField", fontsize=10, ha='center', va='center')
draw_text(ax, 0.85, 0.30, "Button: Appliquer Filtre", fontsize=10, ha='center', va='center')

# Table Columns
columns = ["Année", "Nom du Spectacle", "Nombre de Représentations", "Nombre de Billets Vendus par Représentation", "Total Billets Vendus"]
for i, column in enumerate(columns):
    draw_text(ax, 0.1 + i * 0.2, 0.20, column, fontsize=10, ha='center', va='center')

# Drawing rectangles to represent sections
rects = [
    Rectangle((0.05, 0.70), 0.9, 0.20, linewidth=1, edgecolor='black', facecolor='none'),  # Top section
    Rectangle((0.05, 0.40), 0.3, 0.20, linewidth=1, edgecolor='black', facecolor='none'),  # Left section
    Rectangle((0.05, 0.05), 0.9, 0.30, linewidth=1, edgecolor='black', facecolor='none')   # Center section
]

for rect in rects:
    ax.add_patch(rect)

ax.set_xlim(0, 1)
ax.set_ylim(0, 1)
ax.axis('off')

plt.show()