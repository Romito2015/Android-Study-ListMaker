package com.rchopovenko.listmaker

import android.os.Parcel
import android.os.Parcelable
import android.os.WorkSource


class TaskList(val name: String, val tasks: ArrayList<String> = ArrayList()): Parcelable {

    constructor(source: Parcel): this (source.readString(), source.createStringArrayList())

    override fun describeContents(): Int  = 0

}