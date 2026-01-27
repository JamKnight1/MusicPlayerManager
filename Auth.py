from dotenv import load_dotenv
load_dotenv()

import os

from supabase import create_client

url= os.environ.get("SUPABASE_URL")
key= os.environ.get("SUPABASE_KEY")
supabase= create_client(url, key)

email: str = "jameswise.jk@gmail.com"
password: str = "crymeariver"
#user = supabase.auth.sign_up({"email":email, "password":password})

supabase.auth.sign_in_with_password({"email": "jameswise.jk@gmail.com", "password": "crymeariver"})
