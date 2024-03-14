from json import loads

import requests

URL = "http://localhost:6969/"


def get_json():
    url = URL + "json"
    response = requests.get(url)

    # Parse json to list
    l = loads(response.text)
    for i in l:
        print(i)


# TODO
def get_image():
    pass


# TODO
def get_pdf():
    pass


def main():
    get_json()


if __name__ == '__main__':
    main()
