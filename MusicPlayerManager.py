from dotenv import load_dotenv
load_dotenv()

import os

from supabase import create_client

url= os.environ.get("SUPABASE_URL")
key= os.environ.get("SUPABASE_KEY")
supabase= create_client(url, key)

data = supabase.table("Playlist 1").select("*").execute()
print(data)     #Code that selects the entire table.

#new_song = supabase.table("Playlist 1").insert({"song_name":"With Arms Wide Open", "artist": "Creed", "year_release": "1999"}).execute()
#Code for inserting a new row to the table

#update = supabase.table("Playlist 1").update({"album": "Human Clay"}).eq("id", 5).execute()
#Update code. Does not work while select code is active

#data = supabase.table("Playlist 1").delete().eq("id", 6).execute()
#Deletes superfluous rows

#data = supabase.table("Playlist 1").select("*").execute()
#print(data)
#Select code used for add and remove functions