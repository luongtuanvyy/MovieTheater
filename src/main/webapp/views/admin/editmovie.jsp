<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 8/30/2023
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/flowbite.min.css" rel="stylesheet" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/flowbite.min.js"></script>
</head>

<body>
<nav class="fixed top-0 z-30 w-full bg-white ml-64 border-gray-200 dark:bg-gray-800 dark:border-gray-700">
    <div class="px-3 py-3 lg:px-5 lg:pl-3">
        <div class="flex items-center justify-between">
            <div class="flex items-center justify-start">
                <button data-drawer-target="logo-sidebar" data-drawer-toggle="logo-sidebar"
                        aria-controls="logo-sidebar" type="button"
                        class="inline-flex items-center p-2 text-sm text-gray-500 rounded-lg sm:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600">
                    <span class="sr-only">Open sidebar</span>
                    <svg class="w-6 h-6" aria-hidden="true" fill="currentColor" viewBox="0 0 20 20"
                         xmlns="http://www.w3.org/2000/svg">
                        <path clip-rule="evenodd" fill-rule="evenodd"
                              d="M2 4.75A.75.75 0 012.75 4h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 4.75zm0 10.5a.75.75 0 01.75-.75h7.5a.75.75 0 010 1.5h-7.5a.75.75 0 01-.75-.75zM2 10a.75.75 0 01.75-.75h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 10z">
                        </path>
                    </svg>
                </button>
            </div>
            <div class="flex items-center">
                <div class="flex items-center ml-3">
                    <div>
                        <button type="button"
                                class="flex text-sm bg-gray-800 rounded-full focus:ring-4 focus:ring-gray-300 dark:focus:ring-gray-600"
                                aria-expanded="false" data-dropdown-toggle="dropdown-user">
                            <span class="sr-only">Open user menu</span>
                            <img class="w-8 h-8 rounded-full"
                                 src="https://flowbite.com/docs/images/people/profile-picture-5.jpg"
                                 alt="user photo">
                        </button>
                    </div>
                    <div class="z-50 hidden my-4 text-base list-none bg-white divide-y divide-gray-100 rounded shadow dark:bg-gray-700 dark:divide-gray-600"
                         id="dropdown-user">
                        <div class="px-4 py-3" role="none">
                            <p class="text-sm text-gray-900 dark:text-white" role="none">
                                Neil Sims
                            </p>
                            <p class="text-sm font-medium text-gray-900 truncate dark:text-gray-300" role="none">
                                neil.sims@flowbite.com
                            </p>
                        </div>
                        <ul class="py-1" role="none">
                            <li>
                                <a href="#"
                                   class="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white"
                                   role="menuitem">Dashboard</a>
                            </li>
                            <li>
                                <a href="#"
                                   class="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white"
                                   role="menuitem">Settings</a>
                            </li>
                            <li>
                                <a href="#"
                                   class="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white"
                                   role="menuitem">Earnings</a>
                            </li>
                            <li>
                                <a href="#"
                                   class="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white"
                                   role="menuitem">Sign out</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</nav>

<aside id="logo-sidebar"
       class="fixed top-0 left-0 z-40 w-72 h-screen mt-8 transition-transform -translate-x-full bg-white border-gray-200 sm:translate-x-0 dark:bg-gray-800 dark:border-gray-700"
       aria-label="Sidebar">

    <div class="h-full px-3 pb-4 overflow-y-auto bg-white dark:bg-gray-800">
        <a href="#" class="flex ml-2 mb-8">
            <img src="logo.png" class="h-16 mr-3" alt="FlowBite Logo" />
            <span
                    class="self-center text-xl font-semibold sm:text-2xl whitespace-nowrap dark:text-white">CINEMOUNT</span>
        </a>
        <ul class="space-y-2 font-medium">
            <li class="border-s-2 border-gray-900">
                <a href="#"
                   class="flex items-center ml-2 px-3 py-3  rounded-lg dark:text-white hover:bg-gray-300 dark:hover:bg-gray-700 group">
                    <svg class="w-5 h-5 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white"
                         aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="currentColor"
                         viewBox="0 0 22 21">
                        <path
                                d="M16.975 11H10V4.025a1 1 0 0 0-1.066-.998 8.5 8.5 0 1 0 9.039 9.039.999.999 0 0 0-1-1.066h.002Z" />
                        <path
                                d="M12.5 0c-.157 0-.311.01-.565.027A1 1 0 0 0 11 1.02V10h8.975a1 1 0 0 0 1-.935c.013-.188.028-.374.028-.565A8.51 8.51 0 0 0 12.5 0Z" />
                    </svg>
                    <span class="ml-3">Thống kê</span>
                </a>
            </li>
            <li>
                <a href="#"
                   class="flex items-center ml-2 px-3 py-3 text-gray-900 rounded-lg dark:text-white hover:bg-gray-300 dark:hover:bg-gray-700 group"
                   aria-controls="dropdown-example" data-collapse-toggle="dropdown-example">
                    <svg class="flex-shrink-0 w-5 h-5 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white"
                         aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="currentColor"
                         viewBox="0 0 18 18">
                        <path
                                d="M6.143 0H1.857A1.857 1.857 0 0 0 0 1.857v4.286C0 7.169.831 8 1.857 8h4.286A1.857 1.857 0 0 0 8 6.143V1.857A1.857 1.857 0 0 0 6.143 0Zm10 0h-4.286A1.857 1.857 0 0 0 10 1.857v4.286C10 7.169 10.831 8 11.857 8h4.286A1.857 1.857 0 0 0 18 6.143V1.857A1.857 1.857 0 0 0 16.143 0Zm-10 10H1.857A1.857 1.857 0 0 0 0 11.857v4.286C0 17.169.831 18 1.857 18h4.286A1.857 1.857 0 0 0 8 16.143v-4.286A1.857 1.857 0 0 0 6.143 10Zm10 0h-4.286A1.857 1.857 0 0 0 10 11.857v4.286c0 1.026.831 1.857 1.857 1.857h4.286A1.857 1.857 0 0 0 18 16.143v-4.286A1.857 1.857 0 0 0 16.143 10Z" />
                    </svg>
                    <span class="flex-1 ml-3 whitespace-nowrap">Quản lý</span>
                </a>
                <ul id="dropdown-example" class="py-2 space-y-2">
                    <li>
                        <a href="#"
                           class="flex bg-gray-800 shadow-md ml-2 text-white items-center w-full px-4 py-3 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700">
                            <svg class="text-gray-500" width="24" height="24" viewBox="0 0 24 24" fill="none"
                                 xmlns="http://www.w3.org/2000/svg">
                                <path d="M21 18V7L18 9L12 10L5 9L3 7V18L9 11.5L13 15L16.5 13L19.5 17.5L21 18Z"
                                      fill="currentColor" />
                                <path
                                        d="M3 17L6.03914 13.4543C7.24119 12.0519 7.84222 11.3507 8.58666 11.2437C8.82846 11.209 9.07458 11.2188 9.31284 11.2727C10.0464 11.4388 10.5896 12.1857 11.676 13.6794L11.9869 14.107C12.2379 14.4521 12.3633 14.6246 12.5031 14.7213C12.8185 14.9396 13.2311 14.9582 13.5649 14.7691C13.7128 14.6854 13.8533 14.5248 14.1342 14.2038V14.2038C14.7172 13.5374 15.0088 13.2043 15.3126 13.0352C15.9993 12.6532 16.846 12.7087 17.4769 13.177C17.7562 13.3842 18.0017 13.7526 18.4929 14.4893L20.5 17.5"
                                        stroke="currentColor" stroke-width="2" />
                                <path d="M7 9.5V4.5M17 9.5V4.5" stroke="currentColor" stroke-width="2"
                                      stroke-linecap="round" />
                                <path d="M3 17V7M21 7V17" stroke="currentColor" stroke-width="2"
                                      stroke-linecap="round" />
                                <path
                                        d="M17.0198 4.50998C18.6218 4.86883 19.8353 5.38985 20.4812 5.99615C21.127 6.60244 21.1711 7.26189 20.6067 7.87715C20.0424 8.49242 18.8996 9.03091 17.347 9.41315C15.7944 9.79539 13.9143 10.0011 11.9842 10C10.054 9.99886 8.17609 9.79092 6.62756 9.40686C5.07902 9.0228 3.94192 8.48297 3.38408 7.86705C2.82624 7.25112 2.87721 6.59173 3.52947 5.9862C4.18173 5.38067 5.40073 4.86107 7.00654 4.50411"
                                        stroke="currentColor" stroke-width="2" stroke-linecap="round" />
                                <path
                                        d="M21 17C21 17.7956 20.0518 18.5587 18.364 19.1213C16.6761 19.6839 14.3869 20 12 20C9.61305 20 7.32387 19.6839 5.63604 19.1213C3.94821 18.5587 3 17.7956 3 17"
                                        stroke="currentColor" stroke-width="2" />
                            </svg>
                            <span class="ml-3">Phim</span></a>
                    </li>
                    <li>
                        <a href="#"
                           class="flex items-center w-full ml-2 px-4 py-3 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700">
                            <svg class="text-gray-500" width="24" height="24" viewBox="0 0 24 24" fill="none"
                                 xmlns="http://www.w3.org/2000/svg">
                                <path
                                        d="M2 9C2 7.11438 2 6.17157 2.58579 5.58579C3.17157 5 4.11438 5 6 5H18C19.8856 5 20.8284 5 21.4142 5.58579C22 6.17157 22 7.11438 22 9C22 9.4714 22 9.70711 21.8536 9.85355C21.7071 10 21.4714 10 21 10H3C2.5286 10 2.29289 10 2.14645 9.85355C2 9.70711 2 9.4714 2 9Z"
                                        fill="currentColor" />
                                <path fill-rule="evenodd" clip-rule="evenodd"
                                      d="M2.58579 21.4142C2 20.8284 2 19.8856 2 18V13C2 12.5286 2 12.2929 2.14645 12.1464C2.29289 12 2.5286 12 3 12H21C21.4714 12 21.7071 12 21.8536 12.1464C22 12.2929 22 12.5286 22 13V18C22 19.8856 22 20.8284 21.4142 21.4142C20.8284 22 19.8856 22 18 22H6C4.11438 22 3.17157 22 2.58579 21.4142ZM8 16C7.44772 16 7 16.4477 7 17C7 17.5523 7.44772 18 8 18H16C16.5523 18 17 17.5523 17 17C17 16.4477 16.5523 16 16 16H8Z"
                                      fill="currentColor" />
                                <path d="M7 3L7 6" stroke="currentColor" stroke-width="2" stroke-linecap="round" />
                                <path d="M17 3L17 6" stroke="currentColor" stroke-width="2"
                                      stroke-linecap="round" />
                            </svg>

                            <span class="ml-3">Xuất chiếu</span></a>
                    </li>
                    <li>
                        <a href="#"
                           class="flex items-center w-full ml-2 px-4 py-3 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700">
                            <svg class="text-gray-500" width="24" height="24" viewBox="0 0 24 24" fill="none"
                                 xmlns="http://www.w3.org/2000/svg">
                                <circle cx="12" cy="8" r="4" fill="currentColor" />
                                <path
                                        d="M5.33788 17.3206C5.99897 14.5269 8.77173 13 11.6426 13H12.3574C15.2283 13 18.001 14.5269 18.6621 17.3206C18.79 17.8611 18.8917 18.4268 18.9489 19.0016C19.0036 19.5512 18.5523 20 18 20H6C5.44772 20 4.99642 19.5512 5.0511 19.0016C5.1083 18.4268 5.20997 17.8611 5.33788 17.3206Z"
                                        fill="currentColor" />
                            </svg>

                            <span class="ml-3">Người dùng</span></a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</aside>

<div class="ml-72 pt-14">
    <section class="bg-white dark:bg-gray-900 p-3 sm:p-5 rounded-lg">
        <div class="mx-auto max-w-screen-xl">
            <!-- Start coding here -->
            <a href="" class="ml-4 flex space-x-2"><svg width="24" height="24" viewBox="0 0 24 24" fill="none"
                                                        xmlns="http://www.w3.org/2000/svg">
                <path
                        d="M5 12L4.29289 11.2929L3.58579 12L4.29289 12.7071L5 12ZM17 13C17.5523 13 18 12.5523 18 12C18 11.4477 17.5523 11 17 11V13ZM8.29289 7.29289L4.29289 11.2929L5.70711 12.7071L9.70711 8.70711L8.29289 7.29289ZM4.29289 12.7071L8.29289 16.7071L9.70711 15.2929L5.70711 11.2929L4.29289 12.7071ZM5 13H17V11H5V13Z"
                        fill="#33363F" />
            </svg>
                Trở về</a>
            <section class="bg-white dark:bg-gray-900">
                <div class="w-full">
                    <!-- Start coding here -->
                    <div class="relative bg-white dark:bg-gray-800">
                        <div
                                class="flex flex-col items-center justify-between p-4 space-y-3 md:flex-row md:space-y-0 md:space-x-4">
                            <div class="">
                                <p class="text-xl font-bold">Chi tiết Phim</p>
                            </div>

                            <div class="inline-flex rounded-md space-x-3" role="group">
                                <button type="button"
                                        class="px-4 py-2 text-md font-medium text-gray-900 bg-white hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-2 focus:ring-blue-700 focus:text-blue-700 dark:bg-gray-700 dark:border-gray-600 dark:text-white dark:hover:text-white dark:hover:bg-gray-600 dark:focus:ring-blue-500 dark:focus:text-white">
                                    Hủy thay đổi
                                </button>
                                <button type="button"
                                        class="px-4 py-2 text-md font-medium text-gray-900 bg-white border border-gray-200 rounded-lg hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-2 focus:ring-blue-700 focus:text-blue-700 dark:bg-gray-700 dark:border-gray-600 dark:text-white dark:hover:text-white dark:hover:bg-gray-600 dark:focus:ring-blue-500 dark:focus:text-white"
                                        onclick="const x = () => {
                                          
                                        }"
                                >
                                    Lưu
                                </button>
                                <button id="dropdownMenuIconHorizontalButton"
                                        data-dropdown-toggle="dropdownDotsHorizontal"
                                        class="inline-flex items-center p-2 text-sm font-medium text-center text-gray-900 bg-white rounded-lg hover:bg-gray-100 focus:ring-4 focus:outline-none dark:text-white focus:ring-gray-50 dark:bg-gray-800 dark:hover:bg-gray-700 dark:focus:ring-gray-600"
                                        type="button">
                                    <svg class="w-5 h-5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                                         fill="currentColor" viewBox="0 0 16 3">
                                        <path
                                                d="M2 0a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3Zm6.041 0a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3ZM14 0a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3Z" />
                                    </svg>
                                </button>

                                <!-- Dropdown menu -->
                                <div id="dropdownDotsHorizontal"
                                     class="z-10 hidden bg-white divide-y divide-gray-100 rounded-lg shadow w-44 dark:bg-gray-700 dark:divide-gray-600">
                                    <ul class="py-2 text-sm text-gray-700 dark:text-gray-200"
                                        aria-labelledby="dropdownMenuIconHorizontalButton">
                                        <li>
                                            <a href="#"
                                               class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Xóa</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </section>
            <form action="">
                <div class="grid grid-cols-8">
                    <div class="col-span-5">
                        <section class="bg-white dark:bg-gray-900">
                            <div class="px-4">
                                <form action="#">
                                    <div class="grid gap-4 sm:grid-cols-2 sm:gap-6">
                                        <div class="sm:col-span-2  border border-gray-300 rounded-lg">
                                            <label for="name"
                                                   class="block p-2 pb-0 text-sm font-medium text-gray-500 dark:text-white">Tên
                                                phim ( bắt buộc )</label>
                                            <input type="text" name="name" id="name"
                                                   class="bg-white border-0 pb-4 rounded-lg text-gray-900 text-sm focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 focus:ring-0 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                   placeholder="Tên " required="">
                                        </div>
                                        <div class="sm:col-span-2 border border-gray-300 rounded-lg">
                                            <label for="name"
                                                   class="block p-2 pb-0 text-sm font-medium text-gray-500 dark:text-white">Mô
                                                tả</label>
                                            <textarea id="message" rows="4"
                                                      class="block p-2.5 w-full text-sm text-gray-900 bg-white rounded-lg border-0 border-gray-300 focus:ring-0 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                                      placeholder="Write your thoughts here..."></textarea>
                                        </div>
                                        <div class="sm:col-span-2">
                                            <label for="brand"
                                                   class="block text-sm font-medium text-gray-900 dark:text-white">Hình
                                                ảnh thu nhỏ</label>
                                            <span class="text-sm text-gray-600">Hiển thị hình ảnh thu nhỏ làm nổi
                                                    bật phim</span>
                                            <div class="flex items-center space-x-3 mt-4     w-full">
                                                <label for="dropzone-file"
                                                       class="flex flex-col items-center justify-center w-60 h-40 border-2 border-gray-300 border-dashed rounded-lg cursor-pointer bg-gray-50 dark:hover:bg-bray-800 dark:bg-gray-700 hover:bg-gray-100 dark:border-gray-600 dark:hover:border-gray-500 dark:hover:bg-gray-600">
                                                    <div
                                                            class="flex flex-col items-center justify-center pt-5 pb-6">
                                                        <svg class="w-8 h-8 mb-4 text-gray-500 dark:text-gray-400"
                                                             aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                                                             fill="none" viewBox="0 0 20 16">
                                                            <path stroke="currentColor" stroke-linecap="round"
                                                                  stroke-linejoin="round" stroke-width="2"
                                                                  d="M13 13h3a3 3 0 0 0 0-6h-.025A5.56 5.56 0 0 0 16 6.5 5.5 5.5 0 0 0 5.207 5.021C5.137 5.017 5.071 5 5 5a4 4 0 0 0 0 8h2.167M10 15V6m0 0L8 8m2-2 2 2" />
                                                        </svg>
                                                        <p class="mb-2 text-sm text-gray-500 dark:text-gray-400">
                                                            <span class="font-semibold">Click to upload</span> or
                                                            drag and drop
                                                        </p>
                                                        <p class="text-xs text-gray-500 dark:text-gray-400">SVG,
                                                            PNG, JPG or GIF (MAX. 800x400px)</p>
                                                    </div>
                                                    <input id="dropzone-file" type="file" class="hidden" />
                                                </label>
                                                <div
                                                        class="img h-40 w-64 rounded-lg overflow-hidden border-2 border-gray-500">
                                                    <img src="https://img1.hotstarext.com/image/upload/f_auto,t_web_m_1x/sources/r1/cms/prod/7089/1037089-h-af0efbe1e4a7"
                                                         alt="" class="h-full">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="w-full">
                                            <label for="price"
                                                   class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Thời
                                                lượng ( phút )</label>
                                            <input type="number" name="price" id="price"
                                                   class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-0 focus:border-gray-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                   placeholder="" required="">
                                        </div>
                                        <div>
                                            <label for="category"
                                                   class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Thể
                                                loại</label>

                                            <button id="dropdownSearchButton" data-dropdown-toggle="dropdownSearch"
                                                    class="inline-flex items-center px-4 py-2.5 border-2 border-gray-100 text-sm font-medium text-center bg-white rounded-lg hover:bg-gray-100 focus:ring-0 focus:outline-none focus:ring-blue-300 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
                                                    type="button">Chọn thể loại<svg class="w-2.5 h-2.5 ml-2.5"
                                                                                    aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                                                                                    fill="none" viewBox="0 0 10 6">
                                                <path stroke="currentColor" stroke-linecap="round"
                                                      stroke-linejoin="round" stroke-width="2" d="m1 1 4 4 4-4" />
                                            </svg></button>

                                            <!-- Dropdown menu -->
                                            <div id="dropdownSearch"
                                                 class="z-10 hidden bg-white rounded-lg shadow w-60 dark:bg-gray-700">
                                                <ul class=" px-3 py-2 overflow-y-auto text-sm text-gray-700 dark:text-gray-200"
                                                    aria-labelledby="dropdownSearchButton">
                                                    <li>
                                                        <div
                                                                class="flex items-center p-2 rounded hover:bg-gray-100 dark:hover:bg-gray-600">
                                                            <input id="checkbox-item-11" type="checkbox" value=""
                                                                   class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 rounded focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-700 dark:focus:ring-offset-gray-700 focus:ring-2 dark:bg-gray-600 dark:border-gray-500">
                                                            <label for="checkbox-item-11"
                                                                   class="w-full ml-2 text-sm font-medium text-gray-900 rounded dark:text-gray-300">Bonnie
                                                                Green</label>
                                                        </div>
                                                    </li>
                                                </ul>
                                                <a href="#"
                                                   class="flex items-center p-3 space-x-2 text-sm font-medium text-gray-700 border-t border-gray-200 rounded-b-lg bg-gray-50 dark:border-gray-600 hover:bg-gray-100 dark:bg-gray-700 dark:hover:bg-gray-600 dark:text-red-500">
                                                    <svg width="24" height="24" viewBox="0 0 24 24" fill="none"
                                                         xmlns="http://www.w3.org/2000/svg">
                                                        <path fill-rule="evenodd" clip-rule="evenodd"
                                                              d="M4.17157 4.17157C3 5.34315 3 7.22876 3 11V13C3 16.7712 3 18.6569 4.17157 19.8284C5.34315 21 7.22876 21 11 21H13C16.7712 21 18.6569 21 19.8284 19.8284C21 18.6569 21 16.7712 21 13V11C21 7.22876 21 5.34315 19.8284 4.17157C18.6569 3 16.7712 3 13 3H11C7.22876 3 5.34315 3 4.17157 4.17157ZM11 7V11L7 11V13H11V17H13V13H17V11H13V7H11Z"
                                                              fill="currentColor" />
                                                    </svg>
                                                    <span>
                                                            Thêm thể loại
                                                        </span>
                                                </a>
                                            </div>

                                        </div>
                                        <div>
                                            <label for="item-weight"
                                                   class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Giới
                                                hạn độ tuổi</label>
                                            <input type="number" name="item-weight" id="item-weight"
                                                   class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                                   placeholder="12" required="">
                                        </div>

                                        <div class="">
                                            <label for="description"
                                                   class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Ngày
                                                phát hành</label>
                                            <div class="relative max-w-sm">
                                                <div
                                                        class="absolute inset-y-0 left-0 flex items-center pl-3.5 pointer-events-none">
                                                    <svg class="w-4 h-4 text-gray-500 dark:text-gray-400"
                                                         aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                                                         fill="currentColor" viewBox="0 0 20 20">
                                                        <path
                                                                d="M20 4a2 2 0 0 0-2-2h-2V1a1 1 0 0 0-2 0v1h-3V1a1 1 0 0 0-2 0v1H6V1a1 1 0 0 0-2 0v1H2a2 2 0 0 0-2 2v2h20V4ZM0 18a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V8H0v10Zm5-8h10a1 1 0 0 1 0 2H5a1 1 0 0 1 0-2Z" />
                                                    </svg>
                                                </div>
                                                <input datepicker type="text"
                                                       class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block  pl-10 p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                                       placeholder="Select date">
                                            </div>
                                        </div>

                                    </div>
                                </form>
                            </div>
                        </section>
                    </div>
                    <div class="col-span-3 p-2">
                        <div class="poster mb-2">
                            <!-- <img class="" src="https://wallpaperaccess.com/full/5587837.jpg" alt=""> -->
                            <iframe width="100%" height="250px" class="rounded-lg"
                                    src="https://www.youtube.com/embed/1VIZ89FEjYI?autoplay=0&loop=1&controls=1&showinfo=0&rel=0&modestbranding=1"
                                    title="Disney&#39;s Raya and the Last Dragon | Official Trailer" frameborder="0"
                                    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                                    allowfullscreen></iframe>
                        </div>
                        <div class="sm:col-span-2 my-2 border border-gray-300 rounded-lg">
                            <label for="name"
                                   class="block p-2 pb-0 text-sm font-medium text-gray-500 dark:text-white">Đường dẫn
                                trailer</label>
                            <input type="text" name="name" id="name"
                                   class="bg-white border-0 pb-4 rounded-lg text-gray-900 text-sm focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 focus:ring-0 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"
                                   placeholder="" required="">
                        </div>
                        <div class="">
                            <label for="name"
                                   class="block p-2 pt-0 mb-2 pb-0 text-sm font-medium text-gray-500 dark:text-white">Trạng
                                thái</label>
                            <label class="relative inline-flex ml-2 items-center mb-4 cursor-pointer">
                                <input type="checkbox" value="" checked class="sr-only peer">
                                <div
                                        class="w-11 h-6 bg-gray-200 rounded-full peer peer-focus:ring-4 peer-focus:ring-blue-300 dark:peer-focus:ring-gray-800 dark:bg-gray-700 peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-0.5 after:left-[2px] after:bg-white after:border-gray-300 after:border after:rounded-full after:h-5 after:w-5 after:transition-all dark:border-gray-600 peer-checked:bg-gray-600">
                                </div>
                                <span class="ml-3 text-sm font-medium text-gray-900 dark:text-gray-300">Hiển
                                        thị</span>
                            </label>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </section>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/datepicker.min.js"></script>
</body>

</html>