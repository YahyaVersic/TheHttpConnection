import requests
from json import loads

URL = "http://localhost:6969/"


def get_request_hello():
    url = URL + "hello"
    response = requests.get(url)
    print(response.text)


def get_request_time():
    url = URL + "time"
    response = requests.get(url)
    print(response.text)


def get_request_urls():
    url = URL + "urls"
    response = requests.get(url)
    print(response.text)
    print(type(response))
    print(type(response.text))

    print("All possible endpoints:")
    l = loads(response.text)
    for i in l:
        print(i)


def main():
    # get_request_hello()
    # get_request_time()
    get_request_urls()


if __name__ == '__main__':
    main()
