package ru.itpark;

    class RemoteController {
        private TV tv;

        public void pressButton(int buttonNumber) {
            tv.showChannel(buttonNumber);
        }
    }