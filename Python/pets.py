from account import Account
import string

class Pets:
    age = int
    size = int
    race = string
    clinical_history = string

    def __init__(self,race,size):
        self.race = race
        self.size = size