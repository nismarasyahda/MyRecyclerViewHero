holder.btnFavorite.setOnClickListener {
    Toast.makeText(holder.itemView.context, "Favorite " + listHeroes[position].name, Toast.LENGTH_SHORT).show()
}

holder.btnShare.setOnClickListener {
    Toast.makeText(holder.itemView.context, "Share " + listHeroes[position].name, Toast.LENGTH_SHORT).show()
}
