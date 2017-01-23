

class Vino(object):
    def __init__(self, *args, **kwargs):
        self.nome = kwargs['nome']
        self.pezzi = kwargs.get('pezzi', 1)
        self.prezzo = kwargs.get('prezzo', 0)
        self.bianco = kwargs.get('bianco', False)
        self.rosso = kwargs.get('rosso', False)


class Carrello(object):
    def __init__(self):
        self.prodotti = []

    def add_prodotto(self, p):
        self.prodotti.append(p)

    def remove_prodotto(self, p):
        try:
            self.prodotti.remove(p)
        except ValueError:
            pass

    def costo_totale(self):
        return sum(v.prezzo for v in self.prodotti)
