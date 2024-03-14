import requests
from json import loads

URL = "http://localhost:6969/"


def get_hello():
    url = URL + "hello"
    response = requests.get(url)
    print(response.text)


def get_time():
    url = URL + "time"
    response = requests.get(url)
    print(response.text)


def get_urls():
    url = URL + "urls"
    response = requests.get(url)
    print(response.text)
    print(type(response))
    print(type(response.text))

    print("All possible endpoints:")
    l = loads(response.text)
    for i in l:
        print(i)


def get_ping():
    url = URL + "ping"
    response = requests.get(url)
    print(response.text)


def main():
    # get_hello()
    # get_time()
    # get_urls()
    get_ping()


if __name__ == '__main__':
    main()
